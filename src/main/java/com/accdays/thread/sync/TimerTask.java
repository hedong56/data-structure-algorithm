package com.accdays.thread.sync;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/27 22:05
 * @updateDate 2019/7/27 22:05
 **/
public class TimerTask {

    volatile boolean havingRun = false;


    public synchronized boolean isRun(){

        boolean result = havingRun;

        System.out.println(Thread.currentThread().getName());

        try {
            // 休眠
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        havingRun = !havingRun;

        System.out.println(String.format("返回后 havingRun = %b " , havingRun ));

        return result ;
    }


}
