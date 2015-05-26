package esper.study.main;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.search.FieldCache.DoubleParser;
import org.junit.Before;
import org.junit.Test;

import esper.study.event.Message;
import esper.study.event.ResMessage;
import esper.study.listener.MessageFinder;
import esper.study.listener.MessageFoundListener;

public class TestMessageFinder {

	static String[] blockingType = new String[] { "P", "C", "B" }; // C: 추가인증,
																	// B: 차단 P
																	// 정상
	static String[] RULE_STR = new String[] { "Rule_LO_C01", "Rule_LO_C02",
			"Rule_LO_C03", "Rule_TR_C02", "Rule_TR_C03" }; // C: 추가인증, B: 차단 P
															// 정상
	static String[] RMS_SVC_C = new String[] { "EAIPROGGR1", "EAIPROGGR0",
			"EAIPSIL0I0", "EAIPSIL0I1", "EAIPSIL0I2", "EAIPYE00I0",
			"EAAPAT00I0", "EAICROGGR0", "EAICSIL0I0", "EAICSIL0I1",
			"EAICSIL0I2", "EATBROGGR0", "EATBSIL0I0", "EATBSIL0I1",
			"EATBSIL0I2", "EANBMM98R1", "EANBMM45I0", "EANBMM98R0",
			"EANBMM16R0", "EAIPROGGRX" };

	static String[] EBNK_MED_STR = new String[] { "090", "091", "020", "021","070", "991" }; //

	static Random rand = new Random();

	private final MessageFinder messageFinder = new MessageFinder();

	private Message lastFound = null;
	
	private MessageFoundListener listener = new MessageFoundListener() {
		@Override
		public void found(Message message) {
			System.out.println("found : "+message.toString());
			lastFound = message;
		}
	};

	@Before
	public void setup() {
		messageFinder.setup();
		messageFinder.setMessageFoundListener(listener);
	}

	
	@Test
	public void shouldFound() {
		// on startup
		long from, to;
		from = System.currentTimeMillis(); // 시작시간

		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 1; i > 0; i++) {
			map = new HashMap<String, String>();
			map.put("RULE_STR", RULE_STR[rand.nextInt(RULE_STR.length)]); 			
			// Rule_LO_C01,
			// Rule_LO_C02,
			// Rule_LO_C03,
			// Rule_TR_C02,
			// Rule_TR_C03
			map.put("EBNK_MED_STR",EBNK_MED_STR[rand.nextInt(EBNK_MED_STR.length)]);
			
			// 090:인터넷,
			// 021:모바일,
			// 991:텔레뱅킹,
			// 020:태블릿
			map.put("blockingType",blockingType[rand.nextInt(blockingType.length)]);
			
			// C:추가인증,
			// B:차단,
			// P:정상
			map.put("RMS_SVC_C", RMS_SVC_C[rand.nextInt(RMS_SVC_C.length)]);

			try {
				System.out.println("[count] : " + i + "===================================");				
				addMessageData(map, i);
				//addResMessageData(map, i);
				try { 
					Thread.sleep(1000);					
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("@@@@ END @@@@");

	}

	// Coherence Message Data Put
	public void addMessageData(HashMap<String, String> map, int i) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logID = UUID.randomUUID().toString();
		Date now = new Date();
		String logDateTime = df.format(now);

		Message msg = new Message();

		BigDecimal COMMON_PUBLIC_IP = BigDecimal.valueOf(0);
		String instanceId = "Message";
		String transactionId = instanceId + "_" + i;

		msg.setInstanceId(instanceId);
		msg.setTransactionId(transactionId);
		msg.setTR_DTM(logDateTime);
		msg.setNAAC_DSC("");
		msg.setEBNK_MED_DSC(map.get("EBNK_MED_STR").toString());
		msg.setE_FNC_CUSNO("NO_" + rand.nextInt(1000));
		
		if(i%3 == 0)
			msg.setE_FNC_USRID("chun");
		else
			msg.setE_FNC_USRID("user_dummy_"+ StringUtils.leftPad(String.valueOf(i), 6, "0"));

		msg.setE_FNC_COPR_ID("ID_" + rand.nextInt(1000));
		msg.setCOPR_DS("");
		msg.setLANG_DS("KO");
		msg.setE_FNC_USR_OS_DSC("01");
		msg.setE_FNC_USR_TELNO("");

		msg.setE_FNC_USR_IPADR("192.168.0.40");
		msg.setE_FNC_LGIN_DSC(""); // E금융로그인구분코드
		msg.setE_FNC_TR_ACNO("6666-1111-1111-111"); // E금융거래계좌번호(보내는 계좌)
		msg.setRMS_SVC_C(map.get("RMS_SVC_C").toString()); // 수신서비스코드
		msg.setINQ_CND_CLF_ID("");
		msg.setWORK_GBN("0");

		msg.setINQ_CND_VAL("6666-0000-0000-000");
		msg.setE_FNC_USR_DVIC_INF_CNTN("PC");
		msg.setE_FNC_USR_ACS_DSC("05");
		msg.setE_FNC_MED_SVCID("IPCNA015R");
		msg.setE_FNC_MED_SVRNM("10.78-01");

		msg.setE_FNC_RSP_C("");
		msg.setEXE_YN("Y");
		msg.setSTD_GBL_ID(logID);
		
		Random randNum = new Random();		
		msg.setAmount(randNum.nextInt(100000)); // 금액
		//System.out.println("amount : "+msg.getAmount());
		
		
		msg.setE_FNC_TR_ACNO_C(""); // 타계좌 구분코드

		msg.setTRANSFER_ACNO("142584688"); // 계좌번호 (받는 계좌)
		msg.setCST_NAM("누리어");
		msg.setCOMMON_PUBLIC_IP(COMMON_PUBLIC_IP.valueOf(rand.nextInt(10000) * 1000000));
		msg.setLANG_DS("KR");

		msg.setRES_MSG(rand.nextInt(6) + "");

		msg.setFDS_IDEN(map.get("blockingType").toString());

		// PC
		msg.setPc_publicIP1("66.66.66.66");
		msg.setPc_publicIP2("");
		msg.setPc_publicIP3("");
		msg.setPc_privateIP1("");
		msg.setPc_privateIP2("");
		msg.setPc_privateIP3("");
		msg.setPc_isProxy("N");
		msg.setPc_proxyIP1("166.166.166.166");
		msg.setPc_proxyIP2("201.1.2.123");
		msg.setPc_isVpn("N");
		msg.setPc_vpnIP1("188.188.188.188");
		msg.setPc_vpnIP2("201.1.2.123");
		msg.setPc_macAddr1("6E-6E-6E-6E-6E-6E");
		msg.setPc_macAddr2("201.1.2.123");
		msg.setPc_macAddr3("");
		msg.setPc_logicalMac1("6E-6E-6E-6E-6E-6E");
		msg.setPc_logicalMac2("");
		msg.setPc_logicalMac3("");
		msg.setPc_hddSerial1("66-000000");
		msg.setPc_hddSerial2("5544AB14");
		msg.setPc_hddSerial3("");
		msg.setPc_cpuID("12345sN");
		msg.setPc_mbSn("");
		msg.setPc_winVer("");
		msg.setPc_isVm("N");
		msg.setPc_vmName("VMWARE");
		msg.setPc_gatewayMac("222.111.32.3");
		msg.setPc_gatewayIP("");
		msg.setPc_volumeID("");
		msg.setPc_remoteInfo1("");
		msg.setPc_remoteInfo2("");
		msg.setPc_remoteInfo3("");
		msg.setPc_remoteInfo4("N");
		msg.setPc_remoteInfo5("");
		msg.setPc_remoteInfo6("");
		msg.setPc_remoteInfo7("");
		msg.setPc_remoteInfo8("");
		msg.setPc_remoteInfo9("");
		msg.setPc_remoteInfo10("");
		msg.setPc_foresicInfo("");
		msg.setPc_isWinDefender("N");
		msg.setPc_isWinFirewall("");
		msg.setPc_isAutoPatch("Y");
		msg.setPc_isCertMisuse("8");

		// smart
		msg.setSm_DI("FGSDBsd345");
		msg.setSm_D1("6SFG3456s");
		msg.setSm_D2("df12dfgas");
		msg.setSm_deviceId(rand.nextInt(10) + "3552" + rand.nextInt(10) + "256453");
		msg.setSm_imei(rand.nextInt(10) + "3552" + rand.nextInt(10) + "256453");
		msg.setSm_imsi(rand.nextInt(10) + "5432" + rand.nextInt(10) + "567833");
		msg.setSm_usim(rand.nextInt(10) + "232" + rand.nextInt(10) + "5345833");
		msg.setSm_uuid(logID);
		msg.setSm_wifiMacAddr("98:d6:f7:62:06:f5");
		msg.setSm_ethernetMacAddr("");
		msg.setSm_btMacAddr("");
		msg.setSm_deviceModel("4.4.2");
		msg.setSm_osVersion("4.4.2");
		msg.setSm_service("");
		msg.setSm_locale("ko_KR");
		msg.setSm_network("");
		msg.setSm_publicIP("");
		msg.setSm_wifi_ip("192.168.0.33");
		msg.setSm_3g_ip("241.22.53.11");
		msg.setSm_jailBreak("-1");
		msg.setSm_roaming("N");
		msg.setSm_proxyIp("");
		msg.setSm_wifiApSsid("iptime");
		msg.setSm_mobileAPSsid("LGU+");
		msg.setSm_mobileNumber("01099929764");

		messageFinder.sendMessage(msg);

	}

	// Coherence resMessage Data Put
	public static void addResMessageData(HashMap<String, String> map, int i) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logID = UUID.randomUUID().toString();
		Date now = new Date();
		String logDateTime = df.format(now);
		String receiveNanoTime = Long.toString(System.nanoTime());

		String instanceId = "ResMessage";
		String transactionId = instanceId + "_" + i;

		ResMessage rMsg = new ResMessage();

		rMsg.setBLACK_GBN(map.get("blockingType").toString());
		rMsg.setInstanceId(instanceId);
		rMsg.setRES_MSG(rand.nextInt(6) + "");
		rMsg.setRES_TIME(receiveNanoTime);
		rMsg.setThreadId("1");
		rMsg.setTransactionId(transactionId);

		//maeesageCache.put(transactionId, chartVo);

	}
}
