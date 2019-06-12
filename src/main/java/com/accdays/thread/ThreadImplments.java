package com.accdays.thread;

public class ThreadImplments {

    public static void main(String[] args) {
//        new Thread(new BusinessThread(),"t2").start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()),"t2").start();


    }

}

/**
 * 通过实现接口的方式，实现线程
 */
class BusinessThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
