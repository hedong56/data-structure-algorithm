package com.accdays.algorithm.sort;

import java.util.Arrays;

/**
 * 挖坑填数+分治法
 * @author hedong
 * @date 2016年6月26日 上午11:20:49
 * @modifyNote
 * @version 1.0
 */
public class QuickSort {
	
	
	public static void main(String[] args) {
		int[] s={ 5, 8, 9, 7, 6, 3, 1, 2};
		System.out.println(Arrays.toString(quickSort(s,0,s.length-1)));
	}
	
	
	/**
	 * @Description
	 * @author hedong
	 * @date 2016年6月26日 下午4:00:34
	 * @modifyNote 
	 * @param s 数组
	 * @param lIndex 数组左边的开始索引位置，第一次是0，后面就不是了
	 * @param rIndex 数组右边倒序的开始位置，第一次是数组长度-1，后面就不是了
	 */
	static int[] quickSort(int[] s,int lIndex,int rIndex){
		if(lIndex<rIndex){
			//新建两个变量存放位置索引，这样可以保存传入的索引位置
			int i=lIndex,j=rIndex;
			//将开始位置的数，拿出来作为一个比较标杆，并形成一个坑
			int x=s[i];
			//防止索引交叉
			while(i<j){
				//因为坑是在开始位置，需要小数来填，所以先从后面循环找到比标杆小的数，填坑
				while(i<j&&s[j]>x){
					j--;
				}
				//因为是比较之后还--；
				//如果i<j，说明在后面s[j]找到了<=x的数，需要将这个数填坑
				//如果1==j,说明在后面没有找到比标杆小的数，目前已经是正确的顺序了，不需要填坑
				if(i<j){
					s[i]=s[j];
				}
				//填上了前面的坑，这时在后面出现一个坑，需要从前面找一个大数填上
				while(i<j&&s[i]<x){
					i++;
				}
				if(i<j){
					s[j]=s[i];
				}
			}
			s[i]=x;
			//对左边的数组再进行排序，i-1表示不需要对上一次的标杆进行排序了
			quickSort(s,lIndex,i-1);
			//对右边的数组再进行排序，i+1表示不需要对上一次的标杆进行排序了
			quickSort(s,i+1,rIndex);
		}
		return s;
	}

}
