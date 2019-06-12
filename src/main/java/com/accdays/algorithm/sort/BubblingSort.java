package com.accdays.algorithm.sort;

import com.alibaba.fastjson.JSON;

/**
 * 冒泡法排序
 */
public class BubblingSort {


    public static void main(String[] args) {
        int[] intArr={5,4,3,2,1};
        System.out.println(JSON.toJSONString(sort(intArr)));
    }



    public static int[] sort(int[] intArr){

        for ( int i=0; i<intArr.length; i++) {
            int min=intArr[i];

            for ( int j=i+1; j<intArr.length; j++) {
                int k=intArr[j];

                if(k<min){
                    int t=min;
                    min=k;
                    intArr[i]=min;
                    k=t;
                    intArr[j]=k;
                }
//                System.out.println(JSON.toJSONString(intArr));

            }

        }

        return intArr;

    }


}
