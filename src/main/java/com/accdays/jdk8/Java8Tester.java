package com.accdays.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/10 16:00
 * @updateDate 2019/7/10 16:00
 **/
public class Java8Tester {

    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }

}
