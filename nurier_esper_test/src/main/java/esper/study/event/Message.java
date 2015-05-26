package esper.study.event;

import java.math.BigDecimal;

/**
 * Coherence�� �� ��/���Ž� ����ϴ� POF Object 
 */
public class Message {

	/* �ν��Ͻ� ID */
	private String instanceId;
	
	/* Ʈ������ ID */
	private String transactionId;
	
	/* �޼��� */
	private String TR_DTM="";
    private String NAAC_DSC="";
    private String EBNK_MED_DSC="";
    private String E_FNC_CUSNO="";
    private String E_FNC_USRID="";
    private String E_FNC_COPR_ID="";
    private String COPR_DS="";
    private String LANG_DS="";
    private String E_FNC_USR_OS_DSC="";
    private String E_FNC_USR_TELNO="";
    private String E_FNC_USR_IPADR="";
    private String E_FNC_LGIN_DSC="";
    private String E_FNC_TR_ACNO="";
    private String RMS_SVC_C="";
    private String INQ_CND_CLF_ID="";
    private String INQ_CND_VAL="";
    private String E_FNC_USR_DVIC_INF_CNTN="";
    private String E_FNC_USR_ACS_DSC="";
    private String E_FNC_MED_SVCID="";
    private String E_FNC_MED_SVRNM="";
    private String E_FNC_RSP_C="";
    private String EXE_YN="";
    private double Amount=0;
    private String E_FNC_TR_INNO="";
    private String E_FNC_TR_ACNO_C="";
    private String pc_publicIP1="";
    private String pc_publicIP2="";
    private String pc_publicIP3="";
    private String pc_privateIP1="";
    private String pc_privateIP2="";
    private String pc_privateIP3="";
    private String pc_isProxy="";
    private String pc_proxyIP1="";
    private String pc_proxyIP2="";
    private String pc_isVpn="";
    private String pc_vpnIP1="";
    private String pc_vpnIP2="";
    private String pc_macAddr1="";
    private String pc_macAddr2="";
    private String pc_macAddr3="";
    private String pc_logicalMac1="";
    private String pc_logicalMac2="";
    private String pc_logicalMac3="";
    private String pc_hddSerial1="";
    private String pc_hddSerial2="";
    private String pc_hddSerial3="";
    private String pc_cpuID="";
    private String pc_mbSn="";
    private String pc_winVer="";
    private String pc_isVm="";
    private String pc_vmName="";
    private String pc_gatewayMac="";
    private String pc_gatewayIP="";
    private String pc_volumeID="";
    private String pc_remoteInfo1="";
    private String pc_remoteInfo2="";
    private String pc_remoteInfo3="";
    private String pc_remoteInfo4="";
    private String pc_remoteInfo5="";
    private String pc_remoteInfo6="";
    private String pc_remoteInfo7="";
    private String pc_remoteInfo8="";
    private String pc_remoteInfo9="";
    private String pc_remoteInfo10="";
    private String pc_foresicInfo="";
    private String pc_isWinDefender="";
    private String pc_isWinFirewall="";
    private String pc_isAutoPatch="";
    private String pc_isCertMisuse="";
    private String sm_DI="";
    private String sm_D1="";
    private String sm_D2="";
    private String sm_deviceId="";
    private String sm_imei="";
    private String sm_imsi="";
    private String sm_usim="";
    private String sm_uuid="";
    private String sm_wifiMacAddr="";
    private String sm_ethernetMacAddr="";
    private String sm_btMacAddr="";
    private String sm_deviceModel="";
    private String sm_osVersion="";
    private String sm_service="";
    private String sm_locale="";
    private String sm_network="";
    private String sm_publicIP="";
    private String sm_wifi_ip="";
    private String sm_3g_ip="";
    private String sm_jailBreak="";
    private String sm_roaming="";
    private String sm_proxyIp="";
    private String sm_wifiApSsid="";
    private String sm_mobileAPSsid="";
    private String sm_mobileNumber="";
    private String STD_GBL_ID="";
    private String WORK_GBN="";
    private String FDS_IDEN="";
    private String E_FNC_AP_SVRNM="";
    private String RES_MSG="";
    
    private String TRANSFER_ACNO; //�Աݰ���
    private String CST_NAM; //�? �̸�
    private BigDecimal COMMON_PUBLIC_IP; //����IP(����)
    
    private String TRANSTA;   // ù����ȸ �����ڵ�   
    
    
    /* WAS Session ID - 11/26�� �߰� */
	private String threadId;

	private String PRE_ASSIGN_YN = "";            //1. �ܸ����������� ���Կ���(0:�̰���, 1:�̵�ϱ��, 2:��ϱ��)
	private String SMS_AUTHEN_YN = "";            //2. �޴���SMS�������� ���Կ���(0:�̰���)
	private String ATTC_DS = "";                  //6. ��ȭ����ARS���� ���Կ���
	private String EXCEPT_REGIST = "";            //3. ���ܰ?��Ͽ��� (0:�̵��, 1:���)
	private String EXCEPTION_ADD_AUTHEN_YN = "";  //4. SMS�������񽺰��Կ���(0:�̰���, 1:����)
	private String SMART_AUTHEN_YN = "";          //5. ����Ʈ����������(0:�̰���)
	private String FOREIGN_STAY_YN = "";          //7. �ؿ�ü���������Կ���
	private String SMS_CERT_YN = "";              //8. SMS����������
	private String PW_CD_DS = "";                 //OTP, ����ī��

	public Message() {
	}
	
	


	/**
	 * @param instanceId
	 * @param transactionId
	 * @param tR_DTM
	 * @param nAAC_DSC
	 * @param eBNK_MED_DSC
	 * @param e_FNC_CUSNO
	 * @param e_FNC_USRID
	 * @param e_FNC_COPR_ID
	 * @param cOPR_DS
	 * @param lANG_DS
	 * @param e_FNC_USR_OS_DSC
	 * @param e_FNC_USR_TELNO
	 * @param e_FNC_USR_IPADR
	 * @param e_FNC_LGIN_DSC
	 * @param e_FNC_TR_ACNO
	 * @param rMS_SVC_C
	 * @param iNQ_CND_CLF_ID
	 * @param iNQ_CND_VAL
	 * @param e_FNC_USR_DVIC_INF_CNTN
	 * @param e_FNC_USR_ACS_DSC
	 * @param e_FNC_MED_SVCID
	 * @param e_FNC_MED_SVRNM
	 * @param e_FNC_RSP_C
	 * @param eXE_YN
	 * @param amount
	 * @param e_FNC_TR_INNO
	 * @param e_FNC_TR_ACNO_C
	 * @param pc_publicIP1
	 * @param pc_publicIP2
	 * @param pc_publicIP3
	 * @param pc_privateIP1
	 * @param pc_privateIP2
	 * @param pc_privateIP3
	 * @param pc_isProxy
	 * @param pc_proxyIP1
	 * @param pc_proxyIP2
	 * @param pc_isVpn
	 * @param pc_vpnIP1
	 * @param pc_vpnIP2
	 * @param pc_macAddr1
	 * @param pc_macAddr2
	 * @param pc_macAddr3
	 * @param pc_logicalMac1
	 * @param pc_logicalMac2
	 * @param pc_logicalMac3
	 * @param pc_hddSerial1
	 * @param pc_hddSerial2
	 * @param pc_hddSerial3
	 * @param pc_cpuID
	 * @param pc_mbSn
	 * @param pc_winVer
	 * @param pc_isVm
	 * @param pc_vmName
	 * @param pc_gatewayMac
	 * @param pc_gatewayIP
	 * @param pc_volumeID
	 * @param pc_remoteInfo1
	 * @param pc_remoteInfo2
	 * @param pc_remoteInfo3
	 * @param pc_remoteInfo4
	 * @param pc_remoteInfo5
	 * @param pc_remoteInfo6
	 * @param pc_remoteInfo7
	 * @param pc_remoteInfo8
	 * @param pc_remoteInfo9
	 * @param pc_remoteInfo10
	 * @param pc_foresicInfo
	 * @param pc_isWinDefender
	 * @param pc_isWinFirewall
	 * @param pc_isAutoPatch
	 * @param pc_isCertMisuse
	 * @param sm_DI
	 * @param sm_D1
	 * @param sm_D2
	 * @param sm_deviceId
	 * @param sm_imei
	 * @param sm_imsi
	 * @param sm_usim
	 * @param sm_uuid
	 * @param sm_wifiMacAddr
	 * @param sm_ethernetMacAddr
	 * @param sm_btMacAddr
	 * @param sm_deviceModel
	 * @param sm_osVersion
	 * @param sm_service
	 * @param sm_locale
	 * @param sm_network
	 * @param sm_publicIP
	 * @param sm_wifi_ip
	 * @param sm_3g_ip
	 * @param sm_jailBreak
	 * @param sm_roaming
	 * @param sm_proxyIp
	 * @param sm_wifiApSsid
	 * @param sm_mobileAPSsid
	 * @param sm_mobileNumber
	 * @param sTD_GBL_ID
	 * @param wORK_GBN
	 * @param fDS_IDEN
	 * @param e_FNC_AP_SVRNM
	 * @param rES_MSG
	 * @param tRANSFER_ACNO
	 * @param cST_NAM
	 * @param cOMMON_PUBLIC_IP
	 * @param tRANSTA
	 * @param threadId
	 * @param pRE_ASSIGN_YN
	 * @param sMS_AUTHEN_YN
	 * @param aTTC_DS
	 * @param eXCEPT_REGIST
	 * @param eXCEPTION_ADD_AUTHEN_YN
	 * @param sMART_AUTHEN_YN
	 * @param fOREIGN_STAY_YN
	 * @param sMS_CERT_YN
	 * @param pW_CD_DS
	 */
	public Message(String instanceId, String transactionId, String tR_DTM,
			String nAAC_DSC, String eBNK_MED_DSC, String e_FNC_CUSNO,
			String e_FNC_USRID, String e_FNC_COPR_ID, String cOPR_DS,
			String lANG_DS, String e_FNC_USR_OS_DSC, String e_FNC_USR_TELNO,
			String e_FNC_USR_IPADR, String e_FNC_LGIN_DSC,
			String e_FNC_TR_ACNO, String rMS_SVC_C, String iNQ_CND_CLF_ID,
			String iNQ_CND_VAL, String e_FNC_USR_DVIC_INF_CNTN,
			String e_FNC_USR_ACS_DSC, String e_FNC_MED_SVCID,
			String e_FNC_MED_SVRNM, String e_FNC_RSP_C, String eXE_YN,
			double amount, String e_FNC_TR_INNO, String e_FNC_TR_ACNO_C,
			String pc_publicIP1, String pc_publicIP2, String pc_publicIP3,
			String pc_privateIP1, String pc_privateIP2, String pc_privateIP3,
			String pc_isProxy, String pc_proxyIP1, String pc_proxyIP2,
			String pc_isVpn, String pc_vpnIP1, String pc_vpnIP2,
			String pc_macAddr1, String pc_macAddr2, String pc_macAddr3,
			String pc_logicalMac1, String pc_logicalMac2,
			String pc_logicalMac3, String pc_hddSerial1, String pc_hddSerial2,
			String pc_hddSerial3, String pc_cpuID, String pc_mbSn,
			String pc_winVer, String pc_isVm, String pc_vmName,
			String pc_gatewayMac, String pc_gatewayIP, String pc_volumeID,
			String pc_remoteInfo1, String pc_remoteInfo2,
			String pc_remoteInfo3, String pc_remoteInfo4,
			String pc_remoteInfo5, String pc_remoteInfo6,
			String pc_remoteInfo7, String pc_remoteInfo8,
			String pc_remoteInfo9, String pc_remoteInfo10,
			String pc_foresicInfo, String pc_isWinDefender,
			String pc_isWinFirewall, String pc_isAutoPatch,
			String pc_isCertMisuse, String sm_DI, String sm_D1, String sm_D2,
			String sm_deviceId, String sm_imei, String sm_imsi, String sm_usim,
			String sm_uuid, String sm_wifiMacAddr, String sm_ethernetMacAddr,
			String sm_btMacAddr, String sm_deviceModel, String sm_osVersion,
			String sm_service, String sm_locale, String sm_network,
			String sm_publicIP, String sm_wifi_ip, String sm_3g_ip,
			String sm_jailBreak, String sm_roaming, String sm_proxyIp,
			String sm_wifiApSsid, String sm_mobileAPSsid,
			String sm_mobileNumber, String sTD_GBL_ID, String wORK_GBN,
			String fDS_IDEN, String e_FNC_AP_SVRNM, String rES_MSG,
			String tRANSFER_ACNO, String cST_NAM, BigDecimal cOMMON_PUBLIC_IP,
			String tRANSTA, String threadId, String pRE_ASSIGN_YN,
			String sMS_AUTHEN_YN, String aTTC_DS, String eXCEPT_REGIST,
			String eXCEPTION_ADD_AUTHEN_YN, String sMART_AUTHEN_YN,
			String fOREIGN_STAY_YN, String sMS_CERT_YN, String pW_CD_DS) {
		super();
		this.instanceId = instanceId;
		this.transactionId = transactionId;
		TR_DTM = tR_DTM;
		NAAC_DSC = nAAC_DSC;
		EBNK_MED_DSC = eBNK_MED_DSC;
		E_FNC_CUSNO = e_FNC_CUSNO;
		E_FNC_USRID = e_FNC_USRID;
		E_FNC_COPR_ID = e_FNC_COPR_ID;
		COPR_DS = cOPR_DS;
		LANG_DS = lANG_DS;
		E_FNC_USR_OS_DSC = e_FNC_USR_OS_DSC;
		E_FNC_USR_TELNO = e_FNC_USR_TELNO;
		E_FNC_USR_IPADR = e_FNC_USR_IPADR;
		E_FNC_LGIN_DSC = e_FNC_LGIN_DSC;
		E_FNC_TR_ACNO = e_FNC_TR_ACNO;
		RMS_SVC_C = rMS_SVC_C;
		INQ_CND_CLF_ID = iNQ_CND_CLF_ID;
		INQ_CND_VAL = iNQ_CND_VAL;
		E_FNC_USR_DVIC_INF_CNTN = e_FNC_USR_DVIC_INF_CNTN;
		E_FNC_USR_ACS_DSC = e_FNC_USR_ACS_DSC;
		E_FNC_MED_SVCID = e_FNC_MED_SVCID;
		E_FNC_MED_SVRNM = e_FNC_MED_SVRNM;
		E_FNC_RSP_C = e_FNC_RSP_C;
		EXE_YN = eXE_YN;
		Amount = amount;
		E_FNC_TR_INNO = e_FNC_TR_INNO;
		E_FNC_TR_ACNO_C = e_FNC_TR_ACNO_C;
		this.pc_publicIP1 = pc_publicIP1;
		this.pc_publicIP2 = pc_publicIP2;
		this.pc_publicIP3 = pc_publicIP3;
		this.pc_privateIP1 = pc_privateIP1;
		this.pc_privateIP2 = pc_privateIP2;
		this.pc_privateIP3 = pc_privateIP3;
		this.pc_isProxy = pc_isProxy;
		this.pc_proxyIP1 = pc_proxyIP1;
		this.pc_proxyIP2 = pc_proxyIP2;
		this.pc_isVpn = pc_isVpn;
		this.pc_vpnIP1 = pc_vpnIP1;
		this.pc_vpnIP2 = pc_vpnIP2;
		this.pc_macAddr1 = pc_macAddr1;
		this.pc_macAddr2 = pc_macAddr2;
		this.pc_macAddr3 = pc_macAddr3;
		this.pc_logicalMac1 = pc_logicalMac1;
		this.pc_logicalMac2 = pc_logicalMac2;
		this.pc_logicalMac3 = pc_logicalMac3;
		this.pc_hddSerial1 = pc_hddSerial1;
		this.pc_hddSerial2 = pc_hddSerial2;
		this.pc_hddSerial3 = pc_hddSerial3;
		this.pc_cpuID = pc_cpuID;
		this.pc_mbSn = pc_mbSn;
		this.pc_winVer = pc_winVer;
		this.pc_isVm = pc_isVm;
		this.pc_vmName = pc_vmName;
		this.pc_gatewayMac = pc_gatewayMac;
		this.pc_gatewayIP = pc_gatewayIP;
		this.pc_volumeID = pc_volumeID;
		this.pc_remoteInfo1 = pc_remoteInfo1;
		this.pc_remoteInfo2 = pc_remoteInfo2;
		this.pc_remoteInfo3 = pc_remoteInfo3;
		this.pc_remoteInfo4 = pc_remoteInfo4;
		this.pc_remoteInfo5 = pc_remoteInfo5;
		this.pc_remoteInfo6 = pc_remoteInfo6;
		this.pc_remoteInfo7 = pc_remoteInfo7;
		this.pc_remoteInfo8 = pc_remoteInfo8;
		this.pc_remoteInfo9 = pc_remoteInfo9;
		this.pc_remoteInfo10 = pc_remoteInfo10;
		this.pc_foresicInfo = pc_foresicInfo;
		this.pc_isWinDefender = pc_isWinDefender;
		this.pc_isWinFirewall = pc_isWinFirewall;
		this.pc_isAutoPatch = pc_isAutoPatch;
		this.pc_isCertMisuse = pc_isCertMisuse;
		this.sm_DI = sm_DI;
		this.sm_D1 = sm_D1;
		this.sm_D2 = sm_D2;
		this.sm_deviceId = sm_deviceId;
		this.sm_imei = sm_imei;
		this.sm_imsi = sm_imsi;
		this.sm_usim = sm_usim;
		this.sm_uuid = sm_uuid;
		this.sm_wifiMacAddr = sm_wifiMacAddr;
		this.sm_ethernetMacAddr = sm_ethernetMacAddr;
		this.sm_btMacAddr = sm_btMacAddr;
		this.sm_deviceModel = sm_deviceModel;
		this.sm_osVersion = sm_osVersion;
		this.sm_service = sm_service;
		this.sm_locale = sm_locale;
		this.sm_network = sm_network;
		this.sm_publicIP = sm_publicIP;
		this.sm_wifi_ip = sm_wifi_ip;
		this.sm_3g_ip = sm_3g_ip;
		this.sm_jailBreak = sm_jailBreak;
		this.sm_roaming = sm_roaming;
		this.sm_proxyIp = sm_proxyIp;
		this.sm_wifiApSsid = sm_wifiApSsid;
		this.sm_mobileAPSsid = sm_mobileAPSsid;
		this.sm_mobileNumber = sm_mobileNumber;
		STD_GBL_ID = sTD_GBL_ID;
		WORK_GBN = wORK_GBN;
		FDS_IDEN = fDS_IDEN;
		E_FNC_AP_SVRNM = e_FNC_AP_SVRNM;
		RES_MSG = rES_MSG;
		TRANSFER_ACNO = tRANSFER_ACNO;
		CST_NAM = cST_NAM;
		COMMON_PUBLIC_IP = cOMMON_PUBLIC_IP;
		TRANSTA = tRANSTA;
		this.threadId = threadId;
		PRE_ASSIGN_YN = pRE_ASSIGN_YN;
		SMS_AUTHEN_YN = sMS_AUTHEN_YN;
		ATTC_DS = aTTC_DS;
		EXCEPT_REGIST = eXCEPT_REGIST;
		EXCEPTION_ADD_AUTHEN_YN = eXCEPTION_ADD_AUTHEN_YN;
		SMART_AUTHEN_YN = sMART_AUTHEN_YN;
		FOREIGN_STAY_YN = fOREIGN_STAY_YN;
		SMS_CERT_YN = sMS_CERT_YN;
		PW_CD_DS = pW_CD_DS;
	}

	


	/**
	 * @return the instanceId
	 */
	public String getInstanceId() {
		return instanceId;
	}




	/**
	 * @param instanceId the instanceId to set
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}




	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}




	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}




	/**
	 * @return the tR_DTM
	 */
	public String getTR_DTM() {
		return TR_DTM;
	}




	/**
	 * @param tR_DTM the tR_DTM to set
	 */
	public void setTR_DTM(String tR_DTM) {
		TR_DTM = tR_DTM;
	}




	/**
	 * @return the nAAC_DSC
	 */
	public String getNAAC_DSC() {
		return NAAC_DSC;
	}




	/**
	 * @param nAAC_DSC the nAAC_DSC to set
	 */
	public void setNAAC_DSC(String nAAC_DSC) {
		NAAC_DSC = nAAC_DSC;
	}




	/**
	 * @return the eBNK_MED_DSC
	 */
	public String getEBNK_MED_DSC() {
		return EBNK_MED_DSC;
	}




	/**
	 * @param eBNK_MED_DSC the eBNK_MED_DSC to set
	 */
	public void setEBNK_MED_DSC(String eBNK_MED_DSC) {
		EBNK_MED_DSC = eBNK_MED_DSC;
	}




	/**
	 * @return the e_FNC_CUSNO
	 */
	public String getE_FNC_CUSNO() {
		return E_FNC_CUSNO;
	}




	/**
	 * @param e_FNC_CUSNO the e_FNC_CUSNO to set
	 */
	public void setE_FNC_CUSNO(String e_FNC_CUSNO) {
		E_FNC_CUSNO = e_FNC_CUSNO;
	}




	/**
	 * @return the e_FNC_USRID
	 */
	public String getE_FNC_USRID() {
		return E_FNC_USRID;
	}




	/**
	 * @param e_FNC_USRID the e_FNC_USRID to set
	 */
	public void setE_FNC_USRID(String e_FNC_USRID) {
		E_FNC_USRID = e_FNC_USRID;
	}




	/**
	 * @return the e_FNC_COPR_ID
	 */
	public String getE_FNC_COPR_ID() {
		return E_FNC_COPR_ID;
	}




	/**
	 * @param e_FNC_COPR_ID the e_FNC_COPR_ID to set
	 */
	public void setE_FNC_COPR_ID(String e_FNC_COPR_ID) {
		E_FNC_COPR_ID = e_FNC_COPR_ID;
	}




	/**
	 * @return the cOPR_DS
	 */
	public String getCOPR_DS() {
		return COPR_DS;
	}




	/**
	 * @param cOPR_DS the cOPR_DS to set
	 */
	public void setCOPR_DS(String cOPR_DS) {
		COPR_DS = cOPR_DS;
	}




	/**
	 * @return the lANG_DS
	 */
	public String getLANG_DS() {
		return LANG_DS;
	}




	/**
	 * @param lANG_DS the lANG_DS to set
	 */
	public void setLANG_DS(String lANG_DS) {
		LANG_DS = lANG_DS;
	}




	/**
	 * @return the e_FNC_USR_OS_DSC
	 */
	public String getE_FNC_USR_OS_DSC() {
		return E_FNC_USR_OS_DSC;
	}




	/**
	 * @param e_FNC_USR_OS_DSC the e_FNC_USR_OS_DSC to set
	 */
	public void setE_FNC_USR_OS_DSC(String e_FNC_USR_OS_DSC) {
		E_FNC_USR_OS_DSC = e_FNC_USR_OS_DSC;
	}




	/**
	 * @return the e_FNC_USR_TELNO
	 */
	public String getE_FNC_USR_TELNO() {
		return E_FNC_USR_TELNO;
	}




	/**
	 * @param e_FNC_USR_TELNO the e_FNC_USR_TELNO to set
	 */
	public void setE_FNC_USR_TELNO(String e_FNC_USR_TELNO) {
		E_FNC_USR_TELNO = e_FNC_USR_TELNO;
	}




	/**
	 * @return the e_FNC_USR_IPADR
	 */
	public String getE_FNC_USR_IPADR() {
		return E_FNC_USR_IPADR;
	}




	/**
	 * @param e_FNC_USR_IPADR the e_FNC_USR_IPADR to set
	 */
	public void setE_FNC_USR_IPADR(String e_FNC_USR_IPADR) {
		E_FNC_USR_IPADR = e_FNC_USR_IPADR;
	}




	/**
	 * @return the e_FNC_LGIN_DSC
	 */
	public String getE_FNC_LGIN_DSC() {
		return E_FNC_LGIN_DSC;
	}




	/**
	 * @param e_FNC_LGIN_DSC the e_FNC_LGIN_DSC to set
	 */
	public void setE_FNC_LGIN_DSC(String e_FNC_LGIN_DSC) {
		E_FNC_LGIN_DSC = e_FNC_LGIN_DSC;
	}




	/**
	 * @return the e_FNC_TR_ACNO
	 */
	public String getE_FNC_TR_ACNO() {
		return E_FNC_TR_ACNO;
	}




	/**
	 * @param e_FNC_TR_ACNO the e_FNC_TR_ACNO to set
	 */
	public void setE_FNC_TR_ACNO(String e_FNC_TR_ACNO) {
		E_FNC_TR_ACNO = e_FNC_TR_ACNO;
	}




	/**
	 * @return the rMS_SVC_C
	 */
	public String getRMS_SVC_C() {
		return RMS_SVC_C;
	}




	/**
	 * @param rMS_SVC_C the rMS_SVC_C to set
	 */
	public void setRMS_SVC_C(String rMS_SVC_C) {
		RMS_SVC_C = rMS_SVC_C;
	}




	/**
	 * @return the iNQ_CND_CLF_ID
	 */
	public String getINQ_CND_CLF_ID() {
		return INQ_CND_CLF_ID;
	}




	/**
	 * @param iNQ_CND_CLF_ID the iNQ_CND_CLF_ID to set
	 */
	public void setINQ_CND_CLF_ID(String iNQ_CND_CLF_ID) {
		INQ_CND_CLF_ID = iNQ_CND_CLF_ID;
	}




	/**
	 * @return the iNQ_CND_VAL
	 */
	public String getINQ_CND_VAL() {
		return INQ_CND_VAL;
	}




	/**
	 * @param iNQ_CND_VAL the iNQ_CND_VAL to set
	 */
	public void setINQ_CND_VAL(String iNQ_CND_VAL) {
		INQ_CND_VAL = iNQ_CND_VAL;
	}




	/**
	 * @return the e_FNC_USR_DVIC_INF_CNTN
	 */
	public String getE_FNC_USR_DVIC_INF_CNTN() {
		return E_FNC_USR_DVIC_INF_CNTN;
	}




	/**
	 * @param e_FNC_USR_DVIC_INF_CNTN the e_FNC_USR_DVIC_INF_CNTN to set
	 */
	public void setE_FNC_USR_DVIC_INF_CNTN(String e_FNC_USR_DVIC_INF_CNTN) {
		E_FNC_USR_DVIC_INF_CNTN = e_FNC_USR_DVIC_INF_CNTN;
	}




	/**
	 * @return the e_FNC_USR_ACS_DSC
	 */
	public String getE_FNC_USR_ACS_DSC() {
		return E_FNC_USR_ACS_DSC;
	}




	/**
	 * @param e_FNC_USR_ACS_DSC the e_FNC_USR_ACS_DSC to set
	 */
	public void setE_FNC_USR_ACS_DSC(String e_FNC_USR_ACS_DSC) {
		E_FNC_USR_ACS_DSC = e_FNC_USR_ACS_DSC;
	}




	/**
	 * @return the e_FNC_MED_SVCID
	 */
	public String getE_FNC_MED_SVCID() {
		return E_FNC_MED_SVCID;
	}




	/**
	 * @param e_FNC_MED_SVCID the e_FNC_MED_SVCID to set
	 */
	public void setE_FNC_MED_SVCID(String e_FNC_MED_SVCID) {
		E_FNC_MED_SVCID = e_FNC_MED_SVCID;
	}




	/**
	 * @return the e_FNC_MED_SVRNM
	 */
	public String getE_FNC_MED_SVRNM() {
		return E_FNC_MED_SVRNM;
	}




	/**
	 * @param e_FNC_MED_SVRNM the e_FNC_MED_SVRNM to set
	 */
	public void setE_FNC_MED_SVRNM(String e_FNC_MED_SVRNM) {
		E_FNC_MED_SVRNM = e_FNC_MED_SVRNM;
	}




	/**
	 * @return the e_FNC_RSP_C
	 */
	public String getE_FNC_RSP_C() {
		return E_FNC_RSP_C;
	}




	/**
	 * @param e_FNC_RSP_C the e_FNC_RSP_C to set
	 */
	public void setE_FNC_RSP_C(String e_FNC_RSP_C) {
		E_FNC_RSP_C = e_FNC_RSP_C;
	}




	/**
	 * @return the eXE_YN
	 */
	public String getEXE_YN() {
		return EXE_YN;
	}




	/**
	 * @param eXE_YN the eXE_YN to set
	 */
	public void setEXE_YN(String eXE_YN) {
		EXE_YN = eXE_YN;
	}




	/**
	 * @return the amount
	 */
	public double getAmount() {
		return Amount;
	}




	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		Amount = amount;
	}




	/**
	 * @return the e_FNC_TR_INNO
	 */
	public String getE_FNC_TR_INNO() {
		return E_FNC_TR_INNO;
	}




	/**
	 * @param e_FNC_TR_INNO the e_FNC_TR_INNO to set
	 */
	public void setE_FNC_TR_INNO(String e_FNC_TR_INNO) {
		E_FNC_TR_INNO = e_FNC_TR_INNO;
	}




	/**
	 * @return the e_FNC_TR_ACNO_C
	 */
	public String getE_FNC_TR_ACNO_C() {
		return E_FNC_TR_ACNO_C;
	}




	/**
	 * @param e_FNC_TR_ACNO_C the e_FNC_TR_ACNO_C to set
	 */
	public void setE_FNC_TR_ACNO_C(String e_FNC_TR_ACNO_C) {
		E_FNC_TR_ACNO_C = e_FNC_TR_ACNO_C;
	}




	/**
	 * @return the pc_publicIP1
	 */
	public String getPc_publicIP1() {
		return pc_publicIP1;
	}




	/**
	 * @param pc_publicIP1 the pc_publicIP1 to set
	 */
	public void setPc_publicIP1(String pc_publicIP1) {
		this.pc_publicIP1 = pc_publicIP1;
	}




	/**
	 * @return the pc_publicIP2
	 */
	public String getPc_publicIP2() {
		return pc_publicIP2;
	}




	/**
	 * @param pc_publicIP2 the pc_publicIP2 to set
	 */
	public void setPc_publicIP2(String pc_publicIP2) {
		this.pc_publicIP2 = pc_publicIP2;
	}




	/**
	 * @return the pc_publicIP3
	 */
	public String getPc_publicIP3() {
		return pc_publicIP3;
	}




	/**
	 * @param pc_publicIP3 the pc_publicIP3 to set
	 */
	public void setPc_publicIP3(String pc_publicIP3) {
		this.pc_publicIP3 = pc_publicIP3;
	}




	/**
	 * @return the pc_privateIP1
	 */
	public String getPc_privateIP1() {
		return pc_privateIP1;
	}




	/**
	 * @param pc_privateIP1 the pc_privateIP1 to set
	 */
	public void setPc_privateIP1(String pc_privateIP1) {
		this.pc_privateIP1 = pc_privateIP1;
	}




	/**
	 * @return the pc_privateIP2
	 */
	public String getPc_privateIP2() {
		return pc_privateIP2;
	}




	/**
	 * @param pc_privateIP2 the pc_privateIP2 to set
	 */
	public void setPc_privateIP2(String pc_privateIP2) {
		this.pc_privateIP2 = pc_privateIP2;
	}




	/**
	 * @return the pc_privateIP3
	 */
	public String getPc_privateIP3() {
		return pc_privateIP3;
	}




	/**
	 * @param pc_privateIP3 the pc_privateIP3 to set
	 */
	public void setPc_privateIP3(String pc_privateIP3) {
		this.pc_privateIP3 = pc_privateIP3;
	}




	/**
	 * @return the pc_isProxy
	 */
	public String getPc_isProxy() {
		return pc_isProxy;
	}




	/**
	 * @param pc_isProxy the pc_isProxy to set
	 */
	public void setPc_isProxy(String pc_isProxy) {
		this.pc_isProxy = pc_isProxy;
	}




	/**
	 * @return the pc_proxyIP1
	 */
	public String getPc_proxyIP1() {
		return pc_proxyIP1;
	}




	/**
	 * @param pc_proxyIP1 the pc_proxyIP1 to set
	 */
	public void setPc_proxyIP1(String pc_proxyIP1) {
		this.pc_proxyIP1 = pc_proxyIP1;
	}




	/**
	 * @return the pc_proxyIP2
	 */
	public String getPc_proxyIP2() {
		return pc_proxyIP2;
	}




	/**
	 * @param pc_proxyIP2 the pc_proxyIP2 to set
	 */
	public void setPc_proxyIP2(String pc_proxyIP2) {
		this.pc_proxyIP2 = pc_proxyIP2;
	}




	/**
	 * @return the pc_isVpn
	 */
	public String getPc_isVpn() {
		return pc_isVpn;
	}




	/**
	 * @param pc_isVpn the pc_isVpn to set
	 */
	public void setPc_isVpn(String pc_isVpn) {
		this.pc_isVpn = pc_isVpn;
	}




	/**
	 * @return the pc_vpnIP1
	 */
	public String getPc_vpnIP1() {
		return pc_vpnIP1;
	}




	/**
	 * @param pc_vpnIP1 the pc_vpnIP1 to set
	 */
	public void setPc_vpnIP1(String pc_vpnIP1) {
		this.pc_vpnIP1 = pc_vpnIP1;
	}




	/**
	 * @return the pc_vpnIP2
	 */
	public String getPc_vpnIP2() {
		return pc_vpnIP2;
	}




	/**
	 * @param pc_vpnIP2 the pc_vpnIP2 to set
	 */
	public void setPc_vpnIP2(String pc_vpnIP2) {
		this.pc_vpnIP2 = pc_vpnIP2;
	}




	/**
	 * @return the pc_macAddr1
	 */
	public String getPc_macAddr1() {
		return pc_macAddr1;
	}




	/**
	 * @param pc_macAddr1 the pc_macAddr1 to set
	 */
	public void setPc_macAddr1(String pc_macAddr1) {
		this.pc_macAddr1 = pc_macAddr1;
	}




	/**
	 * @return the pc_macAddr2
	 */
	public String getPc_macAddr2() {
		return pc_macAddr2;
	}




	/**
	 * @param pc_macAddr2 the pc_macAddr2 to set
	 */
	public void setPc_macAddr2(String pc_macAddr2) {
		this.pc_macAddr2 = pc_macAddr2;
	}




	/**
	 * @return the pc_macAddr3
	 */
	public String getPc_macAddr3() {
		return pc_macAddr3;
	}




	/**
	 * @param pc_macAddr3 the pc_macAddr3 to set
	 */
	public void setPc_macAddr3(String pc_macAddr3) {
		this.pc_macAddr3 = pc_macAddr3;
	}




	/**
	 * @return the pc_logicalMac1
	 */
	public String getPc_logicalMac1() {
		return pc_logicalMac1;
	}




	/**
	 * @param pc_logicalMac1 the pc_logicalMac1 to set
	 */
	public void setPc_logicalMac1(String pc_logicalMac1) {
		this.pc_logicalMac1 = pc_logicalMac1;
	}




	/**
	 * @return the pc_logicalMac2
	 */
	public String getPc_logicalMac2() {
		return pc_logicalMac2;
	}




	/**
	 * @param pc_logicalMac2 the pc_logicalMac2 to set
	 */
	public void setPc_logicalMac2(String pc_logicalMac2) {
		this.pc_logicalMac2 = pc_logicalMac2;
	}




	/**
	 * @return the pc_logicalMac3
	 */
	public String getPc_logicalMac3() {
		return pc_logicalMac3;
	}




	/**
	 * @param pc_logicalMac3 the pc_logicalMac3 to set
	 */
	public void setPc_logicalMac3(String pc_logicalMac3) {
		this.pc_logicalMac3 = pc_logicalMac3;
	}




	/**
	 * @return the pc_hddSerial1
	 */
	public String getPc_hddSerial1() {
		return pc_hddSerial1;
	}




	/**
	 * @param pc_hddSerial1 the pc_hddSerial1 to set
	 */
	public void setPc_hddSerial1(String pc_hddSerial1) {
		this.pc_hddSerial1 = pc_hddSerial1;
	}




	/**
	 * @return the pc_hddSerial2
	 */
	public String getPc_hddSerial2() {
		return pc_hddSerial2;
	}




	/**
	 * @param pc_hddSerial2 the pc_hddSerial2 to set
	 */
	public void setPc_hddSerial2(String pc_hddSerial2) {
		this.pc_hddSerial2 = pc_hddSerial2;
	}




	/**
	 * @return the pc_hddSerial3
	 */
	public String getPc_hddSerial3() {
		return pc_hddSerial3;
	}




	/**
	 * @param pc_hddSerial3 the pc_hddSerial3 to set
	 */
	public void setPc_hddSerial3(String pc_hddSerial3) {
		this.pc_hddSerial3 = pc_hddSerial3;
	}




	/**
	 * @return the pc_cpuID
	 */
	public String getPc_cpuID() {
		return pc_cpuID;
	}




	/**
	 * @param pc_cpuID the pc_cpuID to set
	 */
	public void setPc_cpuID(String pc_cpuID) {
		this.pc_cpuID = pc_cpuID;
	}




	/**
	 * @return the pc_mbSn
	 */
	public String getPc_mbSn() {
		return pc_mbSn;
	}




	/**
	 * @param pc_mbSn the pc_mbSn to set
	 */
	public void setPc_mbSn(String pc_mbSn) {
		this.pc_mbSn = pc_mbSn;
	}




	/**
	 * @return the pc_winVer
	 */
	public String getPc_winVer() {
		return pc_winVer;
	}




	/**
	 * @param pc_winVer the pc_winVer to set
	 */
	public void setPc_winVer(String pc_winVer) {
		this.pc_winVer = pc_winVer;
	}




	/**
	 * @return the pc_isVm
	 */
	public String getPc_isVm() {
		return pc_isVm;
	}




	/**
	 * @param pc_isVm the pc_isVm to set
	 */
	public void setPc_isVm(String pc_isVm) {
		this.pc_isVm = pc_isVm;
	}




	/**
	 * @return the pc_vmName
	 */
	public String getPc_vmName() {
		return pc_vmName;
	}




	/**
	 * @param pc_vmName the pc_vmName to set
	 */
	public void setPc_vmName(String pc_vmName) {
		this.pc_vmName = pc_vmName;
	}




	/**
	 * @return the pc_gatewayMac
	 */
	public String getPc_gatewayMac() {
		return pc_gatewayMac;
	}




	/**
	 * @param pc_gatewayMac the pc_gatewayMac to set
	 */
	public void setPc_gatewayMac(String pc_gatewayMac) {
		this.pc_gatewayMac = pc_gatewayMac;
	}




	/**
	 * @return the pc_gatewayIP
	 */
	public String getPc_gatewayIP() {
		return pc_gatewayIP;
	}




	/**
	 * @param pc_gatewayIP the pc_gatewayIP to set
	 */
	public void setPc_gatewayIP(String pc_gatewayIP) {
		this.pc_gatewayIP = pc_gatewayIP;
	}




	/**
	 * @return the pc_volumeID
	 */
	public String getPc_volumeID() {
		return pc_volumeID;
	}




	/**
	 * @param pc_volumeID the pc_volumeID to set
	 */
	public void setPc_volumeID(String pc_volumeID) {
		this.pc_volumeID = pc_volumeID;
	}




	/**
	 * @return the pc_remoteInfo1
	 */
	public String getPc_remoteInfo1() {
		return pc_remoteInfo1;
	}




	/**
	 * @param pc_remoteInfo1 the pc_remoteInfo1 to set
	 */
	public void setPc_remoteInfo1(String pc_remoteInfo1) {
		this.pc_remoteInfo1 = pc_remoteInfo1;
	}




	/**
	 * @return the pc_remoteInfo2
	 */
	public String getPc_remoteInfo2() {
		return pc_remoteInfo2;
	}




	/**
	 * @param pc_remoteInfo2 the pc_remoteInfo2 to set
	 */
	public void setPc_remoteInfo2(String pc_remoteInfo2) {
		this.pc_remoteInfo2 = pc_remoteInfo2;
	}




	/**
	 * @return the pc_remoteInfo3
	 */
	public String getPc_remoteInfo3() {
		return pc_remoteInfo3;
	}




	/**
	 * @param pc_remoteInfo3 the pc_remoteInfo3 to set
	 */
	public void setPc_remoteInfo3(String pc_remoteInfo3) {
		this.pc_remoteInfo3 = pc_remoteInfo3;
	}




	/**
	 * @return the pc_remoteInfo4
	 */
	public String getPc_remoteInfo4() {
		return pc_remoteInfo4;
	}




	/**
	 * @param pc_remoteInfo4 the pc_remoteInfo4 to set
	 */
	public void setPc_remoteInfo4(String pc_remoteInfo4) {
		this.pc_remoteInfo4 = pc_remoteInfo4;
	}




	/**
	 * @return the pc_remoteInfo5
	 */
	public String getPc_remoteInfo5() {
		return pc_remoteInfo5;
	}




	/**
	 * @param pc_remoteInfo5 the pc_remoteInfo5 to set
	 */
	public void setPc_remoteInfo5(String pc_remoteInfo5) {
		this.pc_remoteInfo5 = pc_remoteInfo5;
	}




	/**
	 * @return the pc_remoteInfo6
	 */
	public String getPc_remoteInfo6() {
		return pc_remoteInfo6;
	}




	/**
	 * @param pc_remoteInfo6 the pc_remoteInfo6 to set
	 */
	public void setPc_remoteInfo6(String pc_remoteInfo6) {
		this.pc_remoteInfo6 = pc_remoteInfo6;
	}




	/**
	 * @return the pc_remoteInfo7
	 */
	public String getPc_remoteInfo7() {
		return pc_remoteInfo7;
	}




	/**
	 * @param pc_remoteInfo7 the pc_remoteInfo7 to set
	 */
	public void setPc_remoteInfo7(String pc_remoteInfo7) {
		this.pc_remoteInfo7 = pc_remoteInfo7;
	}




	/**
	 * @return the pc_remoteInfo8
	 */
	public String getPc_remoteInfo8() {
		return pc_remoteInfo8;
	}




	/**
	 * @param pc_remoteInfo8 the pc_remoteInfo8 to set
	 */
	public void setPc_remoteInfo8(String pc_remoteInfo8) {
		this.pc_remoteInfo8 = pc_remoteInfo8;
	}




	/**
	 * @return the pc_remoteInfo9
	 */
	public String getPc_remoteInfo9() {
		return pc_remoteInfo9;
	}




	/**
	 * @param pc_remoteInfo9 the pc_remoteInfo9 to set
	 */
	public void setPc_remoteInfo9(String pc_remoteInfo9) {
		this.pc_remoteInfo9 = pc_remoteInfo9;
	}




	/**
	 * @return the pc_remoteInfo10
	 */
	public String getPc_remoteInfo10() {
		return pc_remoteInfo10;
	}




	/**
	 * @param pc_remoteInfo10 the pc_remoteInfo10 to set
	 */
	public void setPc_remoteInfo10(String pc_remoteInfo10) {
		this.pc_remoteInfo10 = pc_remoteInfo10;
	}




	/**
	 * @return the pc_foresicInfo
	 */
	public String getPc_foresicInfo() {
		return pc_foresicInfo;
	}




	/**
	 * @param pc_foresicInfo the pc_foresicInfo to set
	 */
	public void setPc_foresicInfo(String pc_foresicInfo) {
		this.pc_foresicInfo = pc_foresicInfo;
	}




	/**
	 * @return the pc_isWinDefender
	 */
	public String getPc_isWinDefender() {
		return pc_isWinDefender;
	}




	/**
	 * @param pc_isWinDefender the pc_isWinDefender to set
	 */
	public void setPc_isWinDefender(String pc_isWinDefender) {
		this.pc_isWinDefender = pc_isWinDefender;
	}




	/**
	 * @return the pc_isWinFirewall
	 */
	public String getPc_isWinFirewall() {
		return pc_isWinFirewall;
	}




	/**
	 * @param pc_isWinFirewall the pc_isWinFirewall to set
	 */
	public void setPc_isWinFirewall(String pc_isWinFirewall) {
		this.pc_isWinFirewall = pc_isWinFirewall;
	}




	/**
	 * @return the pc_isAutoPatch
	 */
	public String getPc_isAutoPatch() {
		return pc_isAutoPatch;
	}




	/**
	 * @param pc_isAutoPatch the pc_isAutoPatch to set
	 */
	public void setPc_isAutoPatch(String pc_isAutoPatch) {
		this.pc_isAutoPatch = pc_isAutoPatch;
	}




	/**
	 * @return the pc_isCertMisuse
	 */
	public String getPc_isCertMisuse() {
		return pc_isCertMisuse;
	}




	/**
	 * @param pc_isCertMisuse the pc_isCertMisuse to set
	 */
	public void setPc_isCertMisuse(String pc_isCertMisuse) {
		this.pc_isCertMisuse = pc_isCertMisuse;
	}




	/**
	 * @return the sm_DI
	 */
	public String getSm_DI() {
		return sm_DI;
	}




	/**
	 * @param sm_DI the sm_DI to set
	 */
	public void setSm_DI(String sm_DI) {
		this.sm_DI = sm_DI;
	}




	/**
	 * @return the sm_D1
	 */
	public String getSm_D1() {
		return sm_D1;
	}




	/**
	 * @param sm_D1 the sm_D1 to set
	 */
	public void setSm_D1(String sm_D1) {
		this.sm_D1 = sm_D1;
	}




	/**
	 * @return the sm_D2
	 */
	public String getSm_D2() {
		return sm_D2;
	}




	/**
	 * @param sm_D2 the sm_D2 to set
	 */
	public void setSm_D2(String sm_D2) {
		this.sm_D2 = sm_D2;
	}




	/**
	 * @return the sm_deviceId
	 */
	public String getSm_deviceId() {
		return sm_deviceId;
	}




	/**
	 * @param sm_deviceId the sm_deviceId to set
	 */
	public void setSm_deviceId(String sm_deviceId) {
		this.sm_deviceId = sm_deviceId;
	}




	/**
	 * @return the sm_imei
	 */
	public String getSm_imei() {
		return sm_imei;
	}




	/**
	 * @param sm_imei the sm_imei to set
	 */
	public void setSm_imei(String sm_imei) {
		this.sm_imei = sm_imei;
	}




	/**
	 * @return the sm_imsi
	 */
	public String getSm_imsi() {
		return sm_imsi;
	}




	/**
	 * @param sm_imsi the sm_imsi to set
	 */
	public void setSm_imsi(String sm_imsi) {
		this.sm_imsi = sm_imsi;
	}




	/**
	 * @return the sm_usim
	 */
	public String getSm_usim() {
		return sm_usim;
	}




	/**
	 * @param sm_usim the sm_usim to set
	 */
	public void setSm_usim(String sm_usim) {
		this.sm_usim = sm_usim;
	}




	/**
	 * @return the sm_uuid
	 */
	public String getSm_uuid() {
		return sm_uuid;
	}




	/**
	 * @param sm_uuid the sm_uuid to set
	 */
	public void setSm_uuid(String sm_uuid) {
		this.sm_uuid = sm_uuid;
	}




	/**
	 * @return the sm_wifiMacAddr
	 */
	public String getSm_wifiMacAddr() {
		return sm_wifiMacAddr;
	}




	/**
	 * @param sm_wifiMacAddr the sm_wifiMacAddr to set
	 */
	public void setSm_wifiMacAddr(String sm_wifiMacAddr) {
		this.sm_wifiMacAddr = sm_wifiMacAddr;
	}




	/**
	 * @return the sm_ethernetMacAddr
	 */
	public String getSm_ethernetMacAddr() {
		return sm_ethernetMacAddr;
	}




	/**
	 * @param sm_ethernetMacAddr the sm_ethernetMacAddr to set
	 */
	public void setSm_ethernetMacAddr(String sm_ethernetMacAddr) {
		this.sm_ethernetMacAddr = sm_ethernetMacAddr;
	}




	/**
	 * @return the sm_btMacAddr
	 */
	public String getSm_btMacAddr() {
		return sm_btMacAddr;
	}




	/**
	 * @param sm_btMacAddr the sm_btMacAddr to set
	 */
	public void setSm_btMacAddr(String sm_btMacAddr) {
		this.sm_btMacAddr = sm_btMacAddr;
	}




	/**
	 * @return the sm_deviceModel
	 */
	public String getSm_deviceModel() {
		return sm_deviceModel;
	}




	/**
	 * @param sm_deviceModel the sm_deviceModel to set
	 */
	public void setSm_deviceModel(String sm_deviceModel) {
		this.sm_deviceModel = sm_deviceModel;
	}




	/**
	 * @return the sm_osVersion
	 */
	public String getSm_osVersion() {
		return sm_osVersion;
	}




	/**
	 * @param sm_osVersion the sm_osVersion to set
	 */
	public void setSm_osVersion(String sm_osVersion) {
		this.sm_osVersion = sm_osVersion;
	}




	/**
	 * @return the sm_service
	 */
	public String getSm_service() {
		return sm_service;
	}




	/**
	 * @param sm_service the sm_service to set
	 */
	public void setSm_service(String sm_service) {
		this.sm_service = sm_service;
	}




	/**
	 * @return the sm_locale
	 */
	public String getSm_locale() {
		return sm_locale;
	}




	/**
	 * @param sm_locale the sm_locale to set
	 */
	public void setSm_locale(String sm_locale) {
		this.sm_locale = sm_locale;
	}




	/**
	 * @return the sm_network
	 */
	public String getSm_network() {
		return sm_network;
	}




	/**
	 * @param sm_network the sm_network to set
	 */
	public void setSm_network(String sm_network) {
		this.sm_network = sm_network;
	}




	/**
	 * @return the sm_publicIP
	 */
	public String getSm_publicIP() {
		return sm_publicIP;
	}




	/**
	 * @param sm_publicIP the sm_publicIP to set
	 */
	public void setSm_publicIP(String sm_publicIP) {
		this.sm_publicIP = sm_publicIP;
	}




	/**
	 * @return the sm_wifi_ip
	 */
	public String getSm_wifi_ip() {
		return sm_wifi_ip;
	}




	/**
	 * @param sm_wifi_ip the sm_wifi_ip to set
	 */
	public void setSm_wifi_ip(String sm_wifi_ip) {
		this.sm_wifi_ip = sm_wifi_ip;
	}




	/**
	 * @return the sm_3g_ip
	 */
	public String getSm_3g_ip() {
		return sm_3g_ip;
	}




	/**
	 * @param sm_3g_ip the sm_3g_ip to set
	 */
	public void setSm_3g_ip(String sm_3g_ip) {
		this.sm_3g_ip = sm_3g_ip;
	}




	/**
	 * @return the sm_jailBreak
	 */
	public String getSm_jailBreak() {
		return sm_jailBreak;
	}




	/**
	 * @param sm_jailBreak the sm_jailBreak to set
	 */
	public void setSm_jailBreak(String sm_jailBreak) {
		this.sm_jailBreak = sm_jailBreak;
	}




	/**
	 * @return the sm_roaming
	 */
	public String getSm_roaming() {
		return sm_roaming;
	}




	/**
	 * @param sm_roaming the sm_roaming to set
	 */
	public void setSm_roaming(String sm_roaming) {
		this.sm_roaming = sm_roaming;
	}




	/**
	 * @return the sm_proxyIp
	 */
	public String getSm_proxyIp() {
		return sm_proxyIp;
	}




	/**
	 * @param sm_proxyIp the sm_proxyIp to set
	 */
	public void setSm_proxyIp(String sm_proxyIp) {
		this.sm_proxyIp = sm_proxyIp;
	}




	/**
	 * @return the sm_wifiApSsid
	 */
	public String getSm_wifiApSsid() {
		return sm_wifiApSsid;
	}




	/**
	 * @param sm_wifiApSsid the sm_wifiApSsid to set
	 */
	public void setSm_wifiApSsid(String sm_wifiApSsid) {
		this.sm_wifiApSsid = sm_wifiApSsid;
	}




	/**
	 * @return the sm_mobileAPSsid
	 */
	public String getSm_mobileAPSsid() {
		return sm_mobileAPSsid;
	}




	/**
	 * @param sm_mobileAPSsid the sm_mobileAPSsid to set
	 */
	public void setSm_mobileAPSsid(String sm_mobileAPSsid) {
		this.sm_mobileAPSsid = sm_mobileAPSsid;
	}




	/**
	 * @return the sm_mobileNumber
	 */
	public String getSm_mobileNumber() {
		return sm_mobileNumber;
	}




	/**
	 * @param sm_mobileNumber the sm_mobileNumber to set
	 */
	public void setSm_mobileNumber(String sm_mobileNumber) {
		this.sm_mobileNumber = sm_mobileNumber;
	}




	/**
	 * @return the sTD_GBL_ID
	 */
	public String getSTD_GBL_ID() {
		return STD_GBL_ID;
	}




	/**
	 * @param sTD_GBL_ID the sTD_GBL_ID to set
	 */
	public void setSTD_GBL_ID(String sTD_GBL_ID) {
		STD_GBL_ID = sTD_GBL_ID;
	}




	/**
	 * @return the wORK_GBN
	 */
	public String getWORK_GBN() {
		return WORK_GBN;
	}




	/**
	 * @param wORK_GBN the wORK_GBN to set
	 */
	public void setWORK_GBN(String wORK_GBN) {
		WORK_GBN = wORK_GBN;
	}




	/**
	 * @return the fDS_IDEN
	 */
	public String getFDS_IDEN() {
		return FDS_IDEN;
	}




	/**
	 * @param fDS_IDEN the fDS_IDEN to set
	 */
	public void setFDS_IDEN(String fDS_IDEN) {
		FDS_IDEN = fDS_IDEN;
	}




	/**
	 * @return the e_FNC_AP_SVRNM
	 */
	public String getE_FNC_AP_SVRNM() {
		return E_FNC_AP_SVRNM;
	}




	/**
	 * @param e_FNC_AP_SVRNM the e_FNC_AP_SVRNM to set
	 */
	public void setE_FNC_AP_SVRNM(String e_FNC_AP_SVRNM) {
		E_FNC_AP_SVRNM = e_FNC_AP_SVRNM;
	}




	/**
	 * @return the rES_MSG
	 */
	public String getRES_MSG() {
		return RES_MSG;
	}




	/**
	 * @param rES_MSG the rES_MSG to set
	 */
	public void setRES_MSG(String rES_MSG) {
		RES_MSG = rES_MSG;
	}




	/**
	 * @return the tRANSFER_ACNO
	 */
	public String getTRANSFER_ACNO() {
		return TRANSFER_ACNO;
	}




	/**
	 * @param tRANSFER_ACNO the tRANSFER_ACNO to set
	 */
	public void setTRANSFER_ACNO(String tRANSFER_ACNO) {
		TRANSFER_ACNO = tRANSFER_ACNO;
	}




	/**
	 * @return the cST_NAM
	 */
	public String getCST_NAM() {
		return CST_NAM;
	}




	/**
	 * @param cST_NAM the cST_NAM to set
	 */
	public void setCST_NAM(String cST_NAM) {
		CST_NAM = cST_NAM;
	}




	/**
	 * @return the cOMMON_PUBLIC_IP
	 */
	public BigDecimal getCOMMON_PUBLIC_IP() {
		return COMMON_PUBLIC_IP;
	}




	/**
	 * @param cOMMON_PUBLIC_IP the cOMMON_PUBLIC_IP to set
	 */
	public void setCOMMON_PUBLIC_IP(BigDecimal cOMMON_PUBLIC_IP) {
		COMMON_PUBLIC_IP = cOMMON_PUBLIC_IP;
	}




	/**
	 * @return the tRANSTA
	 */
	public String getTRANSTA() {
		return TRANSTA;
	}




	/**
	 * @param tRANSTA the tRANSTA to set
	 */
	public void setTRANSTA(String tRANSTA) {
		TRANSTA = tRANSTA;
	}




	/**
	 * @return the threadId
	 */
	public String getThreadId() {
		return threadId;
	}




	/**
	 * @param threadId the threadId to set
	 */
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}




	/**
	 * @return the pRE_ASSIGN_YN
	 */
	public String getPRE_ASSIGN_YN() {
		return PRE_ASSIGN_YN;
	}




	/**
	 * @param pRE_ASSIGN_YN the pRE_ASSIGN_YN to set
	 */
	public void setPRE_ASSIGN_YN(String pRE_ASSIGN_YN) {
		PRE_ASSIGN_YN = pRE_ASSIGN_YN;
	}




	/**
	 * @return the sMS_AUTHEN_YN
	 */
	public String getSMS_AUTHEN_YN() {
		return SMS_AUTHEN_YN;
	}




	/**
	 * @param sMS_AUTHEN_YN the sMS_AUTHEN_YN to set
	 */
	public void setSMS_AUTHEN_YN(String sMS_AUTHEN_YN) {
		SMS_AUTHEN_YN = sMS_AUTHEN_YN;
	}




	/**
	 * @return the aTTC_DS
	 */
	public String getATTC_DS() {
		return ATTC_DS;
	}




	/**
	 * @param aTTC_DS the aTTC_DS to set
	 */
	public void setATTC_DS(String aTTC_DS) {
		ATTC_DS = aTTC_DS;
	}




	/**
	 * @return the eXCEPT_REGIST
	 */
	public String getEXCEPT_REGIST() {
		return EXCEPT_REGIST;
	}




	/**
	 * @param eXCEPT_REGIST the eXCEPT_REGIST to set
	 */
	public void setEXCEPT_REGIST(String eXCEPT_REGIST) {
		EXCEPT_REGIST = eXCEPT_REGIST;
	}




	/**
	 * @return the eXCEPTION_ADD_AUTHEN_YN
	 */
	public String getEXCEPTION_ADD_AUTHEN_YN() {
		return EXCEPTION_ADD_AUTHEN_YN;
	}




	/**
	 * @param eXCEPTION_ADD_AUTHEN_YN the eXCEPTION_ADD_AUTHEN_YN to set
	 */
	public void setEXCEPTION_ADD_AUTHEN_YN(String eXCEPTION_ADD_AUTHEN_YN) {
		EXCEPTION_ADD_AUTHEN_YN = eXCEPTION_ADD_AUTHEN_YN;
	}




	/**
	 * @return the sMART_AUTHEN_YN
	 */
	public String getSMART_AUTHEN_YN() {
		return SMART_AUTHEN_YN;
	}




	/**
	 * @param sMART_AUTHEN_YN the sMART_AUTHEN_YN to set
	 */
	public void setSMART_AUTHEN_YN(String sMART_AUTHEN_YN) {
		SMART_AUTHEN_YN = sMART_AUTHEN_YN;
	}




	/**
	 * @return the fOREIGN_STAY_YN
	 */
	public String getFOREIGN_STAY_YN() {
		return FOREIGN_STAY_YN;
	}




	/**
	 * @param fOREIGN_STAY_YN the fOREIGN_STAY_YN to set
	 */
	public void setFOREIGN_STAY_YN(String fOREIGN_STAY_YN) {
		FOREIGN_STAY_YN = fOREIGN_STAY_YN;
	}




	/**
	 * @return the sMS_CERT_YN
	 */
	public String getSMS_CERT_YN() {
		return SMS_CERT_YN;
	}




	/**
	 * @param sMS_CERT_YN the sMS_CERT_YN to set
	 */
	public void setSMS_CERT_YN(String sMS_CERT_YN) {
		SMS_CERT_YN = sMS_CERT_YN;
	}




	/**
	 * @return the pW_CD_DS
	 */
	public String getPW_CD_DS() {
		return PW_CD_DS;
	}




	/**
	 * @param pW_CD_DS the pW_CD_DS to set
	 */
	public void setPW_CD_DS(String pW_CD_DS) {
		PW_CD_DS = pW_CD_DS;
	}


	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [instanceId=" + instanceId + ", transactionId="
				+ transactionId + ", TR_DTM=" + TR_DTM + ", NAAC_DSC="
				+ NAAC_DSC + ", EBNK_MED_DSC=" + EBNK_MED_DSC
				+ ", E_FNC_CUSNO=" + E_FNC_CUSNO + ", E_FNC_USRID="
				+ E_FNC_USRID + ", E_FNC_COPR_ID=" + E_FNC_COPR_ID
				+ ", COPR_DS=" + COPR_DS + ", LANG_DS=" + LANG_DS
				+ ", E_FNC_USR_OS_DSC=" + E_FNC_USR_OS_DSC
				+ ", E_FNC_USR_TELNO=" + E_FNC_USR_TELNO + ", E_FNC_USR_IPADR="
				+ E_FNC_USR_IPADR + ", E_FNC_LGIN_DSC=" + E_FNC_LGIN_DSC
				+ ", E_FNC_TR_ACNO=" + E_FNC_TR_ACNO + ", RMS_SVC_C="
				+ RMS_SVC_C + ", INQ_CND_CLF_ID=" + INQ_CND_CLF_ID
				+ ", INQ_CND_VAL=" + INQ_CND_VAL + ", E_FNC_USR_DVIC_INF_CNTN="
				+ E_FNC_USR_DVIC_INF_CNTN + ", E_FNC_USR_ACS_DSC="
				+ E_FNC_USR_ACS_DSC + ", E_FNC_MED_SVCID=" + E_FNC_MED_SVCID
				+ ", E_FNC_MED_SVRNM=" + E_FNC_MED_SVRNM + ", E_FNC_RSP_C="
				+ E_FNC_RSP_C + ", EXE_YN=" + EXE_YN + ", Amount=" + Amount
				+ ", E_FNC_TR_INNO=" + E_FNC_TR_INNO + ", E_FNC_TR_ACNO_C="
				+ E_FNC_TR_ACNO_C + ", pc_publicIP1=" + pc_publicIP1
				+ ", pc_publicIP2=" + pc_publicIP2 + ", pc_publicIP3="
				+ pc_publicIP3 + ", pc_privateIP1=" + pc_privateIP1
				+ ", pc_privateIP2=" + pc_privateIP2 + ", pc_privateIP3="
				+ pc_privateIP3 + ", pc_isProxy=" + pc_isProxy
				+ ", pc_proxyIP1=" + pc_proxyIP1 + ", pc_proxyIP2="
				+ pc_proxyIP2 + ", pc_isVpn=" + pc_isVpn + ", pc_vpnIP1="
				+ pc_vpnIP1 + ", pc_vpnIP2=" + pc_vpnIP2 + ", pc_macAddr1="
				+ pc_macAddr1 + ", pc_macAddr2=" + pc_macAddr2
				+ ", pc_macAddr3=" + pc_macAddr3 + ", pc_logicalMac1="
				+ pc_logicalMac1 + ", pc_logicalMac2=" + pc_logicalMac2
				+ ", pc_logicalMac3=" + pc_logicalMac3 + ", pc_hddSerial1="
				+ pc_hddSerial1 + ", pc_hddSerial2=" + pc_hddSerial2
				+ ", pc_hddSerial3=" + pc_hddSerial3 + ", pc_cpuID=" + pc_cpuID
				+ ", pc_mbSn=" + pc_mbSn + ", pc_winVer=" + pc_winVer
				+ ", pc_isVm=" + pc_isVm + ", pc_vmName=" + pc_vmName
				+ ", pc_gatewayMac=" + pc_gatewayMac + ", pc_gatewayIP="
				+ pc_gatewayIP + ", pc_volumeID=" + pc_volumeID
				+ ", pc_remoteInfo1=" + pc_remoteInfo1 + ", pc_remoteInfo2="
				+ pc_remoteInfo2 + ", pc_remoteInfo3=" + pc_remoteInfo3
				+ ", pc_remoteInfo4=" + pc_remoteInfo4 + ", pc_remoteInfo5="
				+ pc_remoteInfo5 + ", pc_remoteInfo6=" + pc_remoteInfo6
				+ ", pc_remoteInfo7=" + pc_remoteInfo7 + ", pc_remoteInfo8="
				+ pc_remoteInfo8 + ", pc_remoteInfo9=" + pc_remoteInfo9
				+ ", pc_remoteInfo10=" + pc_remoteInfo10 + ", pc_foresicInfo="
				+ pc_foresicInfo + ", pc_isWinDefender=" + pc_isWinDefender
				+ ", pc_isWinFirewall=" + pc_isWinFirewall
				+ ", pc_isAutoPatch=" + pc_isAutoPatch + ", pc_isCertMisuse="
				+ pc_isCertMisuse + ", sm_DI=" + sm_DI + ", sm_D1=" + sm_D1
				+ ", sm_D2=" + sm_D2 + ", sm_deviceId=" + sm_deviceId
				+ ", sm_imei=" + sm_imei + ", sm_imsi=" + sm_imsi
				+ ", sm_usim=" + sm_usim + ", sm_uuid=" + sm_uuid
				+ ", sm_wifiMacAddr=" + sm_wifiMacAddr
				+ ", sm_ethernetMacAddr=" + sm_ethernetMacAddr
				+ ", sm_btMacAddr=" + sm_btMacAddr + ", sm_deviceModel="
				+ sm_deviceModel + ", sm_osVersion=" + sm_osVersion
				+ ", sm_service=" + sm_service + ", sm_locale=" + sm_locale
				+ ", sm_network=" + sm_network + ", sm_publicIP=" + sm_publicIP
				+ ", sm_wifi_ip=" + sm_wifi_ip + ", sm_3g_ip=" + sm_3g_ip
				+ ", sm_jailBreak=" + sm_jailBreak + ", sm_roaming="
				+ sm_roaming + ", sm_proxyIp=" + sm_proxyIp
				+ ", sm_wifiApSsid=" + sm_wifiApSsid + ", sm_mobileAPSsid="
				+ sm_mobileAPSsid + ", sm_mobileNumber=" + sm_mobileNumber
				+ ", STD_GBL_ID=" + STD_GBL_ID + ", WORK_GBN=" + WORK_GBN
				+ ", FDS_IDEN=" + FDS_IDEN + ", E_FNC_AP_SVRNM="
				+ E_FNC_AP_SVRNM + ", RES_MSG=" + RES_MSG + ", TRANSFER_ACNO="
				+ TRANSFER_ACNO + ", CST_NAM=" + CST_NAM
				+ ", COMMON_PUBLIC_IP=" + COMMON_PUBLIC_IP + ", TRANSTA="
				+ TRANSTA + ", threadId=" + threadId + ", PRE_ASSIGN_YN="
				+ PRE_ASSIGN_YN + ", SMS_AUTHEN_YN=" + SMS_AUTHEN_YN
				+ ", ATTC_DS=" + ATTC_DS + ", EXCEPT_REGIST=" + EXCEPT_REGIST
				+ ", EXCEPTION_ADD_AUTHEN_YN=" + EXCEPTION_ADD_AUTHEN_YN
				+ ", SMART_AUTHEN_YN=" + SMART_AUTHEN_YN + ", FOREIGN_STAY_YN="
				+ FOREIGN_STAY_YN + ", SMS_CERT_YN=" + SMS_CERT_YN
				+ ", PW_CD_DS=" + PW_CD_DS + "]";
	}


	


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ATTC_DS == null) ? 0 : ATTC_DS.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((COMMON_PUBLIC_IP == null) ? 0 : COMMON_PUBLIC_IP.hashCode());
		result = prime * result + ((COPR_DS == null) ? 0 : COPR_DS.hashCode());
		result = prime * result + ((CST_NAM == null) ? 0 : CST_NAM.hashCode());
		result = prime * result
				+ ((EBNK_MED_DSC == null) ? 0 : EBNK_MED_DSC.hashCode());
		result = prime
				* result
				+ ((EXCEPTION_ADD_AUTHEN_YN == null) ? 0
						: EXCEPTION_ADD_AUTHEN_YN.hashCode());
		result = prime * result
				+ ((EXCEPT_REGIST == null) ? 0 : EXCEPT_REGIST.hashCode());
		result = prime * result + ((EXE_YN == null) ? 0 : EXE_YN.hashCode());
		result = prime * result
				+ ((E_FNC_AP_SVRNM == null) ? 0 : E_FNC_AP_SVRNM.hashCode());
		result = prime * result
				+ ((E_FNC_COPR_ID == null) ? 0 : E_FNC_COPR_ID.hashCode());
		result = prime * result
				+ ((E_FNC_CUSNO == null) ? 0 : E_FNC_CUSNO.hashCode());
		result = prime * result
				+ ((E_FNC_LGIN_DSC == null) ? 0 : E_FNC_LGIN_DSC.hashCode());
		result = prime * result
				+ ((E_FNC_MED_SVCID == null) ? 0 : E_FNC_MED_SVCID.hashCode());
		result = prime * result
				+ ((E_FNC_MED_SVRNM == null) ? 0 : E_FNC_MED_SVRNM.hashCode());
		result = prime * result
				+ ((E_FNC_RSP_C == null) ? 0 : E_FNC_RSP_C.hashCode());
		result = prime * result
				+ ((E_FNC_TR_ACNO == null) ? 0 : E_FNC_TR_ACNO.hashCode());
		result = prime * result
				+ ((E_FNC_TR_ACNO_C == null) ? 0 : E_FNC_TR_ACNO_C.hashCode());
		result = prime * result
				+ ((E_FNC_TR_INNO == null) ? 0 : E_FNC_TR_INNO.hashCode());
		result = prime * result
				+ ((E_FNC_USRID == null) ? 0 : E_FNC_USRID.hashCode());
		result = prime
				* result
				+ ((E_FNC_USR_ACS_DSC == null) ? 0 : E_FNC_USR_ACS_DSC
						.hashCode());
		result = prime
				* result
				+ ((E_FNC_USR_DVIC_INF_CNTN == null) ? 0
						: E_FNC_USR_DVIC_INF_CNTN.hashCode());
		result = prime * result
				+ ((E_FNC_USR_IPADR == null) ? 0 : E_FNC_USR_IPADR.hashCode());
		result = prime
				* result
				+ ((E_FNC_USR_OS_DSC == null) ? 0 : E_FNC_USR_OS_DSC.hashCode());
		result = prime * result
				+ ((E_FNC_USR_TELNO == null) ? 0 : E_FNC_USR_TELNO.hashCode());
		result = prime * result
				+ ((FDS_IDEN == null) ? 0 : FDS_IDEN.hashCode());
		result = prime * result
				+ ((FOREIGN_STAY_YN == null) ? 0 : FOREIGN_STAY_YN.hashCode());
		result = prime * result
				+ ((INQ_CND_CLF_ID == null) ? 0 : INQ_CND_CLF_ID.hashCode());
		result = prime * result
				+ ((INQ_CND_VAL == null) ? 0 : INQ_CND_VAL.hashCode());
		result = prime * result + ((LANG_DS == null) ? 0 : LANG_DS.hashCode());
		result = prime * result
				+ ((NAAC_DSC == null) ? 0 : NAAC_DSC.hashCode());
		result = prime * result
				+ ((PRE_ASSIGN_YN == null) ? 0 : PRE_ASSIGN_YN.hashCode());
		result = prime * result
				+ ((PW_CD_DS == null) ? 0 : PW_CD_DS.hashCode());
		result = prime * result + ((RES_MSG == null) ? 0 : RES_MSG.hashCode());
		result = prime * result
				+ ((RMS_SVC_C == null) ? 0 : RMS_SVC_C.hashCode());
		result = prime * result
				+ ((SMART_AUTHEN_YN == null) ? 0 : SMART_AUTHEN_YN.hashCode());
		result = prime * result
				+ ((SMS_AUTHEN_YN == null) ? 0 : SMS_AUTHEN_YN.hashCode());
		result = prime * result
				+ ((SMS_CERT_YN == null) ? 0 : SMS_CERT_YN.hashCode());
		result = prime * result
				+ ((STD_GBL_ID == null) ? 0 : STD_GBL_ID.hashCode());
		result = prime * result
				+ ((TRANSFER_ACNO == null) ? 0 : TRANSFER_ACNO.hashCode());
		result = prime * result + ((TRANSTA == null) ? 0 : TRANSTA.hashCode());
		result = prime * result + ((TR_DTM == null) ? 0 : TR_DTM.hashCode());
		result = prime * result
				+ ((WORK_GBN == null) ? 0 : WORK_GBN.hashCode());
		result = prime * result
				+ ((instanceId == null) ? 0 : instanceId.hashCode());
		result = prime * result
				+ ((pc_cpuID == null) ? 0 : pc_cpuID.hashCode());
		result = prime * result
				+ ((pc_foresicInfo == null) ? 0 : pc_foresicInfo.hashCode());
		result = prime * result
				+ ((pc_gatewayIP == null) ? 0 : pc_gatewayIP.hashCode());
		result = prime * result
				+ ((pc_gatewayMac == null) ? 0 : pc_gatewayMac.hashCode());
		result = prime * result
				+ ((pc_hddSerial1 == null) ? 0 : pc_hddSerial1.hashCode());
		result = prime * result
				+ ((pc_hddSerial2 == null) ? 0 : pc_hddSerial2.hashCode());
		result = prime * result
				+ ((pc_hddSerial3 == null) ? 0 : pc_hddSerial3.hashCode());
		result = prime * result
				+ ((pc_isAutoPatch == null) ? 0 : pc_isAutoPatch.hashCode());
		result = prime * result
				+ ((pc_isCertMisuse == null) ? 0 : pc_isCertMisuse.hashCode());
		result = prime * result
				+ ((pc_isProxy == null) ? 0 : pc_isProxy.hashCode());
		result = prime * result + ((pc_isVm == null) ? 0 : pc_isVm.hashCode());
		result = prime * result
				+ ((pc_isVpn == null) ? 0 : pc_isVpn.hashCode());
		result = prime
				* result
				+ ((pc_isWinDefender == null) ? 0 : pc_isWinDefender.hashCode());
		result = prime
				* result
				+ ((pc_isWinFirewall == null) ? 0 : pc_isWinFirewall.hashCode());
		result = prime * result
				+ ((pc_logicalMac1 == null) ? 0 : pc_logicalMac1.hashCode());
		result = prime * result
				+ ((pc_logicalMac2 == null) ? 0 : pc_logicalMac2.hashCode());
		result = prime * result
				+ ((pc_logicalMac3 == null) ? 0 : pc_logicalMac3.hashCode());
		result = prime * result
				+ ((pc_macAddr1 == null) ? 0 : pc_macAddr1.hashCode());
		result = prime * result
				+ ((pc_macAddr2 == null) ? 0 : pc_macAddr2.hashCode());
		result = prime * result
				+ ((pc_macAddr3 == null) ? 0 : pc_macAddr3.hashCode());
		result = prime * result + ((pc_mbSn == null) ? 0 : pc_mbSn.hashCode());
		result = prime * result
				+ ((pc_privateIP1 == null) ? 0 : pc_privateIP1.hashCode());
		result = prime * result
				+ ((pc_privateIP2 == null) ? 0 : pc_privateIP2.hashCode());
		result = prime * result
				+ ((pc_privateIP3 == null) ? 0 : pc_privateIP3.hashCode());
		result = prime * result
				+ ((pc_proxyIP1 == null) ? 0 : pc_proxyIP1.hashCode());
		result = prime * result
				+ ((pc_proxyIP2 == null) ? 0 : pc_proxyIP2.hashCode());
		result = prime * result
				+ ((pc_publicIP1 == null) ? 0 : pc_publicIP1.hashCode());
		result = prime * result
				+ ((pc_publicIP2 == null) ? 0 : pc_publicIP2.hashCode());
		result = prime * result
				+ ((pc_publicIP3 == null) ? 0 : pc_publicIP3.hashCode());
		result = prime * result
				+ ((pc_remoteInfo1 == null) ? 0 : pc_remoteInfo1.hashCode());
		result = prime * result
				+ ((pc_remoteInfo10 == null) ? 0 : pc_remoteInfo10.hashCode());
		result = prime * result
				+ ((pc_remoteInfo2 == null) ? 0 : pc_remoteInfo2.hashCode());
		result = prime * result
				+ ((pc_remoteInfo3 == null) ? 0 : pc_remoteInfo3.hashCode());
		result = prime * result
				+ ((pc_remoteInfo4 == null) ? 0 : pc_remoteInfo4.hashCode());
		result = prime * result
				+ ((pc_remoteInfo5 == null) ? 0 : pc_remoteInfo5.hashCode());
		result = prime * result
				+ ((pc_remoteInfo6 == null) ? 0 : pc_remoteInfo6.hashCode());
		result = prime * result
				+ ((pc_remoteInfo7 == null) ? 0 : pc_remoteInfo7.hashCode());
		result = prime * result
				+ ((pc_remoteInfo8 == null) ? 0 : pc_remoteInfo8.hashCode());
		result = prime * result
				+ ((pc_remoteInfo9 == null) ? 0 : pc_remoteInfo9.hashCode());
		result = prime * result
				+ ((pc_vmName == null) ? 0 : pc_vmName.hashCode());
		result = prime * result
				+ ((pc_volumeID == null) ? 0 : pc_volumeID.hashCode());
		result = prime * result
				+ ((pc_vpnIP1 == null) ? 0 : pc_vpnIP1.hashCode());
		result = prime * result
				+ ((pc_vpnIP2 == null) ? 0 : pc_vpnIP2.hashCode());
		result = prime * result
				+ ((pc_winVer == null) ? 0 : pc_winVer.hashCode());
		result = prime * result
				+ ((sm_3g_ip == null) ? 0 : sm_3g_ip.hashCode());
		result = prime * result + ((sm_D1 == null) ? 0 : sm_D1.hashCode());
		result = prime * result + ((sm_D2 == null) ? 0 : sm_D2.hashCode());
		result = prime * result + ((sm_DI == null) ? 0 : sm_DI.hashCode());
		result = prime * result
				+ ((sm_btMacAddr == null) ? 0 : sm_btMacAddr.hashCode());
		result = prime * result
				+ ((sm_deviceId == null) ? 0 : sm_deviceId.hashCode());
		result = prime * result
				+ ((sm_deviceModel == null) ? 0 : sm_deviceModel.hashCode());
		result = prime
				* result
				+ ((sm_ethernetMacAddr == null) ? 0 : sm_ethernetMacAddr
						.hashCode());
		result = prime * result + ((sm_imei == null) ? 0 : sm_imei.hashCode());
		result = prime * result + ((sm_imsi == null) ? 0 : sm_imsi.hashCode());
		result = prime * result
				+ ((sm_jailBreak == null) ? 0 : sm_jailBreak.hashCode());
		result = prime * result
				+ ((sm_locale == null) ? 0 : sm_locale.hashCode());
		result = prime * result
				+ ((sm_mobileAPSsid == null) ? 0 : sm_mobileAPSsid.hashCode());
		result = prime * result
				+ ((sm_mobileNumber == null) ? 0 : sm_mobileNumber.hashCode());
		result = prime * result
				+ ((sm_network == null) ? 0 : sm_network.hashCode());
		result = prime * result
				+ ((sm_osVersion == null) ? 0 : sm_osVersion.hashCode());
		result = prime * result
				+ ((sm_proxyIp == null) ? 0 : sm_proxyIp.hashCode());
		result = prime * result
				+ ((sm_publicIP == null) ? 0 : sm_publicIP.hashCode());
		result = prime * result
				+ ((sm_roaming == null) ? 0 : sm_roaming.hashCode());
		result = prime * result
				+ ((sm_service == null) ? 0 : sm_service.hashCode());
		result = prime * result + ((sm_usim == null) ? 0 : sm_usim.hashCode());
		result = prime * result + ((sm_uuid == null) ? 0 : sm_uuid.hashCode());
		result = prime * result
				+ ((sm_wifiApSsid == null) ? 0 : sm_wifiApSsid.hashCode());
		result = prime * result
				+ ((sm_wifiMacAddr == null) ? 0 : sm_wifiMacAddr.hashCode());
		result = prime * result
				+ ((sm_wifi_ip == null) ? 0 : sm_wifi_ip.hashCode());
		result = prime * result
				+ ((threadId == null) ? 0 : threadId.hashCode());
		result = prime * result
				+ ((transactionId == null) ? 0 : transactionId.hashCode());
		return result;
	}

	
}
