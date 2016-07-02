package com.accdays.algorithm.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 3 };
		System.out.println(Arrays.toString(insertSort(arr)));

	}

	/**
	 * 插入排序
	 *
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

		int left, right;

		for (right = 1; right < arr.length; right++) {
			int temp = arr[right];
			left = right;
			while (left > 0 && temp < arr[left - 1]) {
				//如果左边的相邻数比标杆值大，则将左边的数向右移一位
				arr[left] = arr[left - 1];
				left--;
			}
			arr[left] = temp;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

}
