package esper.study.event;

import java.io.IOException;


public class ResMessage{
	/* �ν��Ͻ� ID */
	private String instanceId;
	/* Ʈ������ ID */
	private String transactionId;
	/* �����ڵ� */
	private String RES_MSG="";
	/* OEP Ž���ð� */
	private String RES_TIME="";
	/* �?����Ʈ ���� */
	private String BLACK_GBN="";
	
	/* WAS Session ID - 11/26�� �߰� */
	private String threadId;
	
	public ResMessage(){}

	/**
	 * @param instanceId
	 * @param transactionId
	 * @param rES_MSG
	 * @param rES_TIME
	 * @param bLACK_GBN
	 */
	public ResMessage(String instanceId, String transactionId, String rES_MSG,
			String rES_TIME, String bLACK_GBN, String threadId) {
		super();
		this.instanceId = instanceId;
		this.transactionId = transactionId;
		this.RES_MSG = rES_MSG;
		this.RES_TIME = rES_TIME;
		this.BLACK_GBN = bLACK_GBN;
		this.threadId = threadId;
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
	 * @return the rES_TIME
	 */
	public String getRES_TIME() {
		return RES_TIME;
	}

	/**
	 * @param rES_TIME the rES_TIME to set
	 */
	public void setRES_TIME(String rES_TIME) {
		RES_TIME = rES_TIME;
	}

	/**
	 * @return the bLACK_GBN
	 */
	public String getBLACK_GBN() {
		return BLACK_GBN;
	}

	/**
	 * @param bLACK_GBN the bLACK_GBN to set
	 */
	public void setBLACK_GBN(String bLACK_GBN) {
		BLACK_GBN = bLACK_GBN;
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

		
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResMessage [instanceId=" + instanceId + ", transactionId="
				+ transactionId + ", RES_MSG=" + RES_MSG + ", RES_TIME="
				+ RES_TIME + ", BLACK_GBN=" + BLACK_GBN + ", threadId="
				+ threadId + "]";
	}

	
}
