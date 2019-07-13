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
        int target = 15;
        System.out.println(testBinarySearch(arr, target));
    }


    public static int testBinarySearch(int[] arr, int target) {

        int result = -1;

        if (arr == null || arr.length == 0) {
            return result;
        }

        int left = 0;
        int right = arr.length - 1;
        int mid = arr.length / 2;

        while (mid != left && mid != right) {

            if (arr[mid] == target) {

                result = mid;
                break;

            } else if (arr[mid] > target) {

                right = mid;
                mid = (left + mid) / 2;


            } else {

                left = mid;
                mid = (mid + right) / 2;

            }

        }


        return result;
    }


}
