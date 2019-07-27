package com.accdays.thread.sync;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/27 22:11
 * @updateDate 2019/7/27 22:11
 **/
public class SyncTest {


    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        TimerTask timerTask = new TimerTask();

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);

        ExecutorService pool = new ThreadPoolExecutor( 2, 2 , 6 , TimeUnit.SECONDS , workQueue);
//        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(() -> System.out.println( String.format("线程名字：%s  ; 返回值：%b ；时间：%s " , Thread.currentThread().getName() ,timerTask.isRun() , sdf.format(new Date()) )) );

        pool.execute(() -> System.out.println( String.format("线程名字：%s  ; 返回值：%b ；时间：%s " , Thread.currentThread().getName() ,timerTask.isRun() , sdf.format(new Date()) )) );








    }

}
