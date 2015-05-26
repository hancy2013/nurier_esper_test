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

import esper.study.event.StockTick;

public class StockFinder {
    private EPServiceProvider epService;
    private EPStatement eps;
    private StockFoundListener listener;

    public void setup() {
        Configuration config = new Configuration();
        // 1. StockTick 클래스를 Esper가 사용할 이벤트 타입으로 등록
        config.addEventType("StockTick", StockTick.class);

        // 2. config를 이용해서 EPService 생성
        epService = EPServiceProviderManager.getProvider("StockTick", config);

        // 3. epService를 이용해서 EPL 생성
        StringBuffer sbEpl = new StringBuffer(); 
        //sbEpl.append("select * from StockTick t where t.rate >= 10");
        sbEpl.append("SELECT first(*) as tick1, last(*) as tick2 "); 
        sbEpl.append("  FROM StockTick.win:time(5 seconds)  ");
        sbEpl.append("GROUP BY code  ");
        sbEpl.append("having first(*) != last(*) and (last(cost) - first(cost)) / first(cost) >= 0.05 ");
        eps = epService.getEPAdministrator().createEPL(sbEpl.toString());

        // 4. EPL의 결과를 받는 리스너 등록
        eps.addListener(new UpdateListener() {
            @Override
            public void update(EventBean[] newEvents, EventBean[] oldEvents) {
                StockTick stockTick = (StockTick) newEvents[0].getUnderlying();
                if (listener != null){ 
                	System.out.println(stockTick.toString());
                	listener.found(stockTick);
                }
            }
        });
    }

    public void setStockFoundListener(StockFoundListener listener) {
        this.listener = listener;
    }

    public void sendStockTick(StockTick tick) {
        // 5. EP런타임에 이벤트 전달
        epService.getEPRuntime().sendEvent(tick);
    }
}
