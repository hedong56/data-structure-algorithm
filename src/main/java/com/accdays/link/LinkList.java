package com.accdays.link;

/**
 * 链表
 * @author hedong
 * @date 2016年4月12日 下午11:35:00
 * @modifyNote
 * @version 1.0
 */
public class LinkList {
	
	private Link first;

	public LinkList() {
		//可以推到最后一个节点是null
		first=null;
	}
	
	
	public boolean isEmpty(){
		return first==null;
	}
	
	/**
	 * 在LinkList开始位置(第一个位置)插入Link
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午11:26:44
	 * @modifyNote 
	 * @param iData
	 * @param dData
	 */
	public void insertFirst(int iData,double dData){
		Link newLink=new Link(iData,dData);
		newLink.next=first;
		first=newLink;
	}
	
	/**
	 * 在LinkList开始位置(第一个位置)插入Link
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午11:26:44
	 * @modifyNote 
	 * @param link
	 */
	public void insertFirst(Link link){
		link.next=first;
		first=link;
	}
	
	
	/**
	 * 删除第一个节点
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午11:30:32
	 * @modifyNote 
	 * @return
	 */
	public Link deleteFirst(){
		//注意：必须先将第一个节点暂存起来
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	/**
	 * 查找指定节点
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午11:48:13
	 * @modifyNote 
	 * @param key
	 * @return
	 */
	public Link find(int key){
		Link resultLink=null;
		Link current=first;
		while(current!=null){
			if(current.iData==key){
				resultLink=current;
				break;
			}
			current=current.next;
		}
		return resultLink;
	}
	
	/**
	 * 删除指定节点
	 * @Description
	 * @author hedong
	 * @date 2016年4月12日 下午11:55:08
	 * @modifyNote 
	 * @param key
	 * @return
	 */
	public Link delete(int key){
		Link resultLink=null;
		//当前节点的上一个节点
		Link prevLink=null;
		Link current=first;
		while(current!=null){
			if(current.iData==key){
				//如果是第一个节点
				if(prevLink==null){
					first=current.next;
				}else{
					prevLink.next=current.next;
				}
				resultLink=current;
				break;
			}
			prevLink=current;
			current=current.next;
		}
		return resultLink;
	}
	
	public void displayLinkList(){
		Link current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
	}
	

}
