package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 22:38
 * @updateDate 2019/7/23 22:38
 **/
public class Test1 {

    public static void main(String[] args) {
        String foo = "blue";
        String bar = foo;
        foo = "gree";
        // 打印 blue
        System.out.println(bar);

    }


}
