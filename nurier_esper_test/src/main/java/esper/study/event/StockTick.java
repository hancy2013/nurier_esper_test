package esper.study.event;

/**
 * StockTick.java Class is Designed for providing 
 *
 * Copyright    Copyright (c) 2015
 * Company     Nurier Co.
 *
 * @Author      : 천종은
 * @File        : esper.study.event.StockTick.java
 * @Version     : 1.0,
 * @See         : 
 * @Date        : 2015. 5. 21. - 오후 1:21:36
 * @Commnad:
 *
 **/

public class StockTick {

	private String name;
    private String code;
    private int cost;
    private int fluctuation;
    private double rate;

    public StockTick(String name, String code, int cost, int fluctuation, double rate) {
        this.name = name;
        this.code = code;
        this.cost = cost;
        this.fluctuation = fluctuation;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCost() {
        return cost;
    }

    public int getFluctuation() {
        return fluctuation;
    }

    public double getRate() {
        return rate;
    }

	@Override
	public String toString() {
		return "StockTick [name=" + name + ", code=" + code + ", cost=" + cost
				+ ", fluctuation=" + fluctuation + ", rate=" + rate + "]";
	}
    
    
}
