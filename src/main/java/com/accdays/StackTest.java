package com.accdays;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
//		Stack<String> st=new Stack<String>();
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		/**
//		 * 上面是顶
//		 */
//		System.out.println(st.search("1"));
//		System.out.println(st.search("2"));
//		System.out.println(st.search("3"));
		
		
		Stack<User> st2=new Stack<User>();
		
		User u=new User();
		
		st2.push(u);
		
		System.out.println(st2.search(u));
		
	}
	
	public static void print(Stack<?> st){
		System.out.println();
	}

}

class User{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
