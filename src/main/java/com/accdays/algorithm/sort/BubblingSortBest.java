package com.accdays.algorithm.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/13 16:05
 * @updateDate 2019/7/13 16:05
 **/
public class BubblingSortBest {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }


    private static int[] sort(int[] arr){

        for (int i = 0 ; i < arr.length ; i++ ){
            //循环一次，排除一个最小的数到前面
            for (int j = i+1 ; j < arr.length ; j++ ){
                if(arr[i]>arr[j]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }

        return arr;
    }

}
