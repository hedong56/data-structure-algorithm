package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 22:50
 * @updateDate 2019/7/23 22:50
 **/
public class StaticStuf {

    static int x = 10;

    static {
        x += 5;
    }

    public static void main(String[] args) {
        System.out.println( "x = " + x);
    }


    static {
        x /= 3 ;
    }


}
