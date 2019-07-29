package com.accdays.jdk8;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/27 16:31
 * @updateDate 2019/7/27 16:31
 **/
public interface CalcService {


    int add( int a , int b );

    default int subtraction(int a , int b){
        return a - b ;
    }

    static int multiplication( int a , int b ){
        return a * b ;
    }


}
