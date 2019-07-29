package com.accdays.thread.alternate;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 23:42
 * @updateDate 2019/7/23 23:42
 **/
public class ThreadTest {

    public static void main(String[] args) {
        AlternatePrint ap = new AlternatePrint();

        NumberThread numberThread = new NumberThread(ap);
        CharThread charThread = new CharThread(ap);

        numberThread.start();
        charThread.start();




    }

}
