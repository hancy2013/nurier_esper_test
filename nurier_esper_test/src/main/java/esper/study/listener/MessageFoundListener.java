package esper.study.listener;

import esper.study.event.Message;

/**
 * StockFoundListener.java Class is Designed for providing 
 *
 * Copyright    Copyright (c) 2015
 * Company     Nurier Co.
 *
 * @Author      : 천종은
 * @File        : esper.study.listener.StockFoundListener.java
 * @Version     : 1.0,
 * @See         : 
 * @Date        : 2015. 5. 21. - 오후 1:23:07
 * @Commnad:
 *
 **/

public interface MessageFoundListener {
	public void found(Message message);
}
