package com.accdays.algorithm.sort;

import java.util.Scanner;

public class JieCheng {


    public static void main(String[] args) {

        System.out.print("请输入整数");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(jiechang(num));
    }

    public static int jiechang(int i){

        int result=1;

        while (i>0){
            result = result * i;
            i--;
        }

        return result;
    }


}
