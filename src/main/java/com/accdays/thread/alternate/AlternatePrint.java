package com.accdays.thread.alternate;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 23:05
 * @updateDate 2019/7/23 23:05
 **/
public class AlternatePrint {


    int[] numberArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int numberIndex = 0 ;

    char[] charArr = { 'A','B','C','D','E','F','G','H' };
    int charIndex = 0 ;

    volatile boolean printNumber = true ;

    //打印数字
    public synchronized void printNumber(){
       while (!printNumber){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       if(numberIndex >= numberArr.length ){
           numberIndex = 0 ;
       }

        System.out.println(numberArr[numberIndex]);
        numberIndex ++;

       printNumber = false ;
       notify();


    }


    //打印数字
    public synchronized void printChar(){
        // 当是打印数字状态时，
        // 则打印字符等待
        while (printNumber){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(charIndex >= charArr.length ){
            charIndex = 0 ;
        }

        System.out.println(charArr[charIndex]);
        charIndex ++;

        printNumber = true ;
        notify();


    }



}
