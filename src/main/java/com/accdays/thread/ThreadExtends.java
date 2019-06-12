package com.accdays.thread;

public class ThreadExtends {

    public static void main(String[] args) {

        new DetailThread("t1").start();
    }

}


/**
 * 通过继承方式实现线程
 */
class DetailThread extends Thread{

    public DetailThread() {
    }

    /**
     * 设置线程名称
     * @param name
     */
    public DetailThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
