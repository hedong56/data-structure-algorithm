package com.accdays.algorithm.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 3 };
		System.out.println(Arrays.toString(insertSort(arr)));

	}

	/**
	 * 插入排序
	 * 关键：在前面已经排好序的序列中找到合适的插入位置
	 * https://blog.csdn.net/zdp072/article/details/44221803
	 * 依次比较，逐位后移
	 *
	 * 取一个标杆值，认为标杆值左边的数都是已经排好序的，右边的乱序。 从索引为1的数开始，把标杆值依次和左边的有序值进行比较，
	 * 如果左边的相邻数比标杆值大，则将左边的数向右移一位 当标杆值小于左边的值时，左边索引不再向左移。 此时左边的索引位置就是标杆的位置
	 * 
	 * @Description
	 * @author hedong
	 * @date 2016-7-1 下午4:33:45
	 * @modifyNote
	 * @param arr
	 * @return
	 */
	static int[] insertSort(int[] arr) {

		int left; //左面已经排好序的最大序号
		int right;	//右边未排序的最小序号

		for (right = 1; right < arr.length; right++) {
			int temp = arr[right];  //需要排序插入的元素
			left = right-1;
			while (left >= 0 && arr[left] > temp) {
				//如果左边的数比标杆值大，则将左边的数向右移一位,向后移动一位
				arr[left+1] = arr[left];
				left--;
			}
			//左边的arr[left] 已经小于标杆值temp
			//由于上面的循环最后减了一位，所以要加1
			arr[left+1] = temp;
//			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

}
