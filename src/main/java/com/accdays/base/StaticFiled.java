package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 22:53
 * @updateDate 2019/7/23 22:53
 **/
public class StaticFiled {

    static int x = 100 ;

    public static void main(String[] args) {
        StaticFiled staticFiled = new StaticFiled();
// 编译不能通过
//        staticFiled.x++;

    }
}
