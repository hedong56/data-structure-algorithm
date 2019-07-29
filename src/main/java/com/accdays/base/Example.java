package com.accdays.base;

import java.util.Arrays;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 15:43
 * @updateDate 2019/7/23 15:43
 **/
public class Example {

    String str = "good";

    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {

        Example ex = new Example();
        //字符传是final，不能修改，引用传递
        ex.change(ex.str, ex.ch);
        System.out.println("ex.str = " + ex.str);  //good
        System.out.println("ex.ch = " + Arrays.toString(ex.ch)); // g b c

    }

    public void change(String str,char ch[]){
        str = "test ok";
//        System.out.println("str = " + str ); // test ok
        ch[0] = 'g';
    }

}
