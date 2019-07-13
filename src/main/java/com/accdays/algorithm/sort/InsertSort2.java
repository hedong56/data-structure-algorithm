package com.accdays.algorithm.sort;

import java.util.Arrays;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/13 16:26
 * @updateDate 2019/7/13 16:26
 **/
public class InsertSort2 {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(insertSortFor(arr)));
//        System.out.println(Arrays.toString(insertSortWhile(arr)));
    }


    public static int[] insertSortFor(int[] arr ){

        //从第二个数开始,i=1
        for(int i=1;i<arr.length;i++){

            //将arr[j]项与前面已经排好序的数逐项比较，交换
            //注意，开始想是j=i
            for(int j=i;j>0;j--){

                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

            }

        }

        return arr;

    }


    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }



    public static int[] insertSortWhile(int[] arr ){

        for(int currentIndex=1;currentIndex<arr.length;currentIndex++){

            int current=arr[currentIndex];
            //左边已经排好序
            int left=currentIndex-1;

            while( left>=0 && arr[left] > current ){
                int t=arr[left];
                arr[left+1]=t;
                arr[left]=current;
                left--;

            }


        }

        return arr;

    }










}
