package com.accdays;


import java.util.Arrays;

import org.apache.log4j.Logger;
import org.junit.Test;

public class PriorityQueueTest {
	
	
	static Logger logger=Logger.getLogger(PriorityQueueTest.class);
	
	@Test
	public void testPriorityQue(){
		
		PriorityQueue priorityQueue=new PriorityQueue(5);
		
		priorityQueue.insert(1);
		priorityQueue.insert(3);
		priorityQueue.insert(5);
		priorityQueue.insert(8);
		priorityQueue.insert(4);
		
		long[] priQueArray=priorityQueue.getQueueArray();
		
		logger.info(Arrays.toString(priQueArray));
		
		//删除一个元素
		while(!priorityQueue.isEmpty()){
			logger.info(priorityQueue.remove());
		}
		
	}
	

}
