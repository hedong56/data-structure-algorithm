package com.accdays.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();


		list.add(3);
		list.add(2);
		list.add(1);

		/*
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});
*/
		list.sort((o1, o2) -> {
			if(o1-o2 >= 0){
				return 1;
			}else{
				return -1;
			}
		});

		System.out.println(list);


	}

}
