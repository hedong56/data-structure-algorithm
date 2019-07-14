package com.accdays.algorithm.sort;

import java.util.Arrays;

/**
 * 挖坑填数+分治法
 *
 * @author hedong
 * @version 1.0
 * @date 2016年6月26日 上午11:20:49
 * @modifyNote
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 9, 7, 6, 3, 1, 2, 0, 6, 6};
        System.out.println(Arrays.toString(quickSort(arr, 0, s.length - 1)));
    }


    /**
     * @param arr        数组
     * @param leftBound  数组左边的开始索引位置，第一次是0，后面就不是了
     * @param rightBound 数组右边倒序的开始位置，第一次是数组长度-1，后面就不是了
     * @description
     * @author hedong
     * @date 2016年6月26日 下午4:00:34
     * @modifyNote
     */
    static int[] quickSort(int[] arr, int leftBound, int rightBound) {
        if (leftBound < rightBound) {
            //新建两个变量存放位置索引，这样可以保存传入的索引位置
            int leftIndex = leftBound;
            int rightIndex = rightBound;
            //将开始位置的数，拿出来作为一个比较标杆，并形成一个坑
            int midVal = arr[leftIndex];
            //防止索引交叉
            while (leftIndex < rightIndex) {
                //因为坑是在开始位置，需要小数来填，所以先从后面循环找到比标杆小的数，填坑
                while (leftIndex < rightIndex && arr[rightIndex] >= midVal) {
                    rightIndex--;
                }
                //因为是比较之后还--；
                //如果i<j，说明在后面s[j]找到了<=x的数，需要将这个数填坑
                //如果1==j,说明在后面没有找到比标杆小的数，目前已经是正确的顺序了，不需要填坑
                if (leftIndex < rightIndex) {
                    arr[leftIndex] = arr[rightIndex];
                }
                //填上了前面的坑，这时在后面出现一个坑，需要从前面找一个大数填上
                while (leftIndex < rightIndex && arr[leftIndex] <= midVal) {
                    leftIndex++;
                }
                if (leftIndex < rightIndex) {
                    arr[rightIndex] = arr[leftIndex];
                }
            }
            arr[leftIndex] = midVal;
            //对左边的数组再进行排序，i-1表示不需要对上一次的标杆进行排序了
            quickSort(arr, leftBound, leftIndex - 1);
            //对右边的数组再进行排序，i+1表示不需要对上一次的标杆进行排序了
            quickSort(arr, leftIndex + 1, rightBound);
        }
        return arr;
    }

}
