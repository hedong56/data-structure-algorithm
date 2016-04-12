package com.accdays;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.accdays.link.Link;
import com.accdays.link.LinkList;

public class LinkListTest {
	
	static Logger logger=Logger.getLogger(LinkListTest.class);
	
	@Test
	public void testLinkList(){
		LinkList linkList=new LinkList();
		Link l1=new Link(10,10);
		Link l2=new Link(20,20);
		Link l3=new Link(30,30);
		Link l4=new Link(40,40);
		
		linkList.insertFirst(l2);
		linkList.insertFirst(l3);
		linkList.insertFirst(l1);
		linkList.insertFirst(l4);
		
		linkList.displayLinkList();
		
		linkList.deleteFirst();
		
		linkList.displayLinkList();
		
	}
	
	@Test
	public void testDelete(){
		LinkList linkList=new LinkList();
		Link l1=new Link(10,10);
		Link l2=new Link(20,20);
		Link l3=new Link(30,30);
		Link l4=new Link(40,40);
		
		linkList.insertFirst(l2);
		linkList.insertFirst(l3);
		linkList.insertFirst(l1);
		linkList.insertFirst(l4);
		
		linkList.displayLinkList();
		
		logger.info("----------------------");
		
		linkList.delete(40);
		
		linkList.displayLinkList();
		
	}

}
