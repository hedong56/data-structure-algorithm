package com.accdays;

/**
 * 优先级队列
 * 基本先进先出，会按key值的大小排序
 * 优先级队列顺序，8,5,4,3,1
 * @author hedong
 * @date 2016年4月12日 下午9:24:47
 * @modifyNote
 * @version 1.0
 */
public class PriorityQueue {
	
	//队列元素最大存储个数
	private int maxSize;
	
	//队列数组
	private long[] queueArray;
	
	public long[] getQueueArray() {
		return queueArray;
	}

	//元素个数
	private int nItems;
	
	public PriorityQueue(int s){
		maxSize=s;
		queueArray=new long[maxSize];
		nItems=0;
	}
	
	/**
	 * 插入队列元素
	 * 小的数放前面，大的数放后面
	 * 例如：8,5,4,3,1
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午9:30:27
	 * @modifyNote 
	 * @param item
	 */
	public void insert(long item){
		int j;
		if(nItems==0){
			queueArray[nItems++]=item;
		}else{
			for(j=nItems-1;j>=0;j--){
				if(item>queueArray[j]){
					queueArray[j+1]=queueArray[j];
				}else{
					break;
				}
			}
			queueArray[j+1]=item;
			nItems++;
		}
	}
	
	/**
	 * 删除最前面，最小的元素
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午9:58:08
	 * @modifyNote 
	 * @return
	 */
	public long remove(){
		return queueArray[--nItems];
	}
	
	/**
	 * 获得最小的元素
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午9:59:22
	 * @modifyNote 
	 * @return
	 */
	public long peekMin(){
		return queueArray[nItems-1];
	}
	
	/**
	 * 队列是否为空
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午10:00:15
	 * @modifyNote 
	 * @return
	 */
	public boolean isEmpty(){
		return nItems==0;
	}
	
	/**
	 * 队列是否已满
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午10:00:41
	 * @modifyNote 
	 * @return
	 */
	public boolean isFull(){
		return nItems==maxSize;
	}
	
	
	
	/**
	public static void main(String[] args) {
		PriorityQueue priorityQueue=new PriorityQueue(5);
		
		priorityQueue.insert(1);
		priorityQueue.insert(3);
		priorityQueue.insert(5);
		priorityQueue.insert(8);
		priorityQueue.insert(4);
		
		long[] arr=priorityQueue.getQueueArray();
		
		System.out.println(Arrays.toString(arr));
		
	}
	**/

}


