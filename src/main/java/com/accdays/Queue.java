package com.accdays;

/**
 * 队列
 * @author hedong
 * @date 2016年4月10日 下午10:07:51
 * @modifyNote
 * @version 1.0
 */
public class Queue {
	//最大长度
	private int maxSize;
	//队列数组
	private long[] queArray;
	//前索引位置
	private int front;
	//末尾索引位置
	private int rear;
	//队列元素个数
	private int nItems;
	
	public Queue(int s){
		maxSize=s;
		queArray=new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	/**
	 * 添加一个元素在末尾
	 * @Description
	 * @author hedong
	 * @date 2016年4月10日 下午10:15:38
	 * @modifyNote 
	 * @param item
	 */
	public void insert(long item){
		if(!isFull()){
			if(rear==maxSize-1){
				rear=-1;
			}
			queArray[++rear]=item;
			nItems++;
		}
	}
	
	/**
	 * 删除元素从前端
	 * 实际上不是真正的删除，只是把前端位置索引向前移动一位而已,并且减少队列个数
	 * @Description
	 * @author hedong
	 * @date 2016年4月10日 下午10:25:53
	 * @modifyNote 
	 * @return
	 * @throws Exception 
	 */
	public long removeItem() throws Exception{
		if(!isEmpty()){
			long item=queArray[front++];
			if(front==maxSize){
				front=0;
			}
			nItems--;
			return item;
		}else{
			throw new Exception("队列为空，不能删除");
		}
	}
	
	/**
	 * 得到队列的头元素
	 * @Description
	 * @author hedong
	 * @date 2016年4月10日 下午10:28:49
	 * @modifyNote 
	 * @return
	 */
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems==maxSize;
	}
	
	public int size(){
		return nItems;
	}
	
}
