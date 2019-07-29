package com.accdays.jdk8;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/27 16:39
 * @updateDate 2019/7/27 16:39
 **/
public class CalcTest {


    public static void main(String[] args) {

        CalcService calcService = new CalcServiceImpl();

        System.out.println(CalcService.multiplication(2, 3));

        System.out.println(calcService.subtraction(2 , 3));


    }

}
