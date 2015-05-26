package esper.study.listener;

/**
 * StockFinder.java Class is Designed for providing 
 *
 * Copyright    Copyright (c) 2015
 * Company     Nurier Co.
 *
 * @Author      : 천종은
 * @File        : esper.study.main.StockFinder.java
 * @Version     : 1.0,
 * @See         : 
 * @Date        : 2015. 5. 21. - 오후 1:22:37
 * @Commnad:
 *
 **/

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

import esper.study.event.Message;

public class MessageFinder {
    private EPServiceProvider epService;
    private EPStatement eps;
    private MessageFoundListener listener;

    public void setup() {
        Configuration config = new Configuration();
        // 1. StockTick 클래스를 Esper가 사용할 이벤트 타입으로 등록
        config.addEventType("Message", Message.class);

        // 2. config를 이용해서 EPService 생성
        epService = EPServiceProviderManager.getProvider("Message", config);

        // 3. epService를 이용해서 EPL 생성
        StringBuffer sbEpl = new StringBuffer(); 
        //sbEpl.append("SELECT e_FNC_USRID FROM Message.win:time(60 sec) WHERE amount >= 70000 ");
        
        /** Property Names
	        getPrice()	price	select price from MyEvent
	        getNAME()	NAME	select NAME from MyEvent
	        getItemDesc()	itemDesc	select itemDesc from MyEvent
	        getQ()	q	 select q from MyEvent
	        getQN()	QN	 select QN from MyEvent
	        getqn()	qn	 select qn from MyEvent
	        gets()	s	 select s from MyEvent
        **/
        sbEpl.append("@Name('가상 OS 사용')  SELECT e_FNC_USRID,sum(amount) "); 
        sbEpl.append("  FROM Message.win:time_batch(5 sec)  "); //최근 5초
        sbEpl.append("GROUP BY e_FNC_USRID  ");
        sbEpl.append("HAVING COUNT(*) > 3 ");
        
//        sbEpl.append("SELECT e_FNC_USRID,avg(aMOUNT)"); 
//        sbEpl.append("  FROM Message.win:time(60 sec)  "); //최근 5초
//        sbEpl.append("GROUP BY e_FNC_USRID  ");
//        sbEpl.append("HAVING aMOUNT >= 10000.05 ");
        eps = epService.getEPAdministrator().createEPL(sbEpl.toString());

        // 4. EPL의 결과를 받는 리스너 등록
        eps.addListener(new UpdateListener() {
            @Override
            public void update(EventBean[] newEvents, EventBean[] oldEvents) {
            	if (listener != null){
            		System.out.println("newEvents.length : "+ newEvents.length );
            		for(int i=0;i < newEvents.length;i++){
            			try{            				
            				StringBuffer sbFieldInfo = new StringBuffer();
            				for(int j=0;j < newEvents[i].getEventType().getPropertyNames().length;j++){            					
            					sbFieldInfo.append("[name:"+newEvents[i].getEventType().getPropertyNames()[j]);
            					sbFieldInfo.append(" ,value:"+ newEvents[i].get(newEvents[i].getEventType().getPropertyNames()[j])+"]");
            					//listener.found(message);
            				}            				  
            				System.out.println(sbFieldInfo.toString());
            			}catch(Throwable e){
            				System.out.println(e.toString());
            			}
	            	}                 	
                }
            }
        });
    }

    public void setMessageFoundListener(MessageFoundListener listener) {
        this.listener = listener;
    }

    public void sendMessage(Message tick) {    	
        // 5. EP런타임에 이벤트 전달
        epService.getEPRuntime().sendEvent(tick);
    }
}
