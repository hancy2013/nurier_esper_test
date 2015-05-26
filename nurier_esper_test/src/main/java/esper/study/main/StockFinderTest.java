package esper.study.main;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import esper.study.event.StockTick;
import esper.study.listener.StockFinder;
import esper.study.listener.StockFoundListener;
/**
 * StockFinderTest.java Class is Designed for providing 
 *
 * Copyright    Copyright (c) 2015
 * Company     Nurier Co.
 *
 * @Author      : 천종은
 * @File        : esper.study.main.StockFinderTest.java
 * @Version     : 1.0,
 * @See         : 
 * @Date        : 2015. 5. 21. - 오후 1:24:05
 * @Commnad:
 *
 **/

public class StockFinderTest {
	private final StockFinder stockFinder = new StockFinder();

    private StockTick lastFound = null;
    private StockFoundListener listener = new StockFoundListener() {
        @Override
        public void found(StockTick stockTick) {
            lastFound = stockTick;
        }
    };

    @Before
    public void setup() {
        stockFinder.setup();
        stockFinder.setStockFoundListener(listener);
    }

    @Test
    public void shouldFound() {
    	
        StockTick tick1 = new StockTick("name", "code", 109, 9, 19.0);
        stockFinder.sendStockTick(tick1);
        //assertThat(lastFound, nullValue());

        /*StockTick tick2 = new StockTick("name", "code", 110, 10, 10.0);
        stockFinder.sendStockTick(tick2);*/
        //assertThat(lastFound, equalTo(tick2));
    }
}
