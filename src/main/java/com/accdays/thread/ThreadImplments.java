package com.accdays.thread;

public class ThreadImplments {

    public static void main(String[] args) {
        //普通方式
//        new Thread(new BusinessThread(),"t2").start();

        //Lambda表达式方式
        //@FunctionalInterface 只能有一个方法，(方法参数)->{方法体}
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
