package com.accdays.algorithm.sort.search;


/**
 * @author hedong
 * @version 1.0
 * @description 二分查找算法
 * 前提：已经排好序的数组。
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/13 14:01
 * @updateDate 2019/7/13 14:01
 **/
public class Binary {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 100;
        System.out.println(testBinarySearch(arr, target));
    }


    public static int testBinarySearch(int[] arr, int target) {

        int result = -1;

        if (arr == null || arr.length == 0) {
            return result;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            //除以2 ，也可以用位移 无符号右移>>>
            int mid = (start + end) / 2;

            if (arr[mid] == target) {

                result = mid;
                break;

            //中间值大于目标值，说明在左面，
            //那么结束值可以用end=mid；但是mid已经比较过，所以mid-1
            } else if (arr[mid] > target) {

                end = mid - 1;

            } else {

                start = mid + 1;

            }

        }


        return result;
    }


}
