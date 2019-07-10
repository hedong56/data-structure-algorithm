package com.accdays.keyword;



class Father20 {

    protected static int count = 0;

    public Father20() {
        count++ ;
        System.out.println("Father20 ,count = " + count);
    }
}

public class Child20 extends Father20 {


    public Child20() {
        count++ ;
        System.out.println("Child20 ,count = " + count);
    }


    public static void main(String[] args) {
        new Child20();
        System.out.println(count);
    }



}
