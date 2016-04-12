package com.accdays.link;

import org.apache.log4j.Logger;

/**
 * 链表接点
 * 有一个指向下一个接点的Link
 * @author hedong
 * @date 2016年4月12日 下午11:22:21
 * @modifyNote
 * @version 1.0
 */
public class Link {
	
	static Logger logger=Logger.getLogger(Link.class);
	
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink(){
		logger.info("{"+iData+","+dData+"}");
	}
	

}
