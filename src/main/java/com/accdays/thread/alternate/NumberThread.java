package com.accdays.thread.alternate;

import java.util.Random;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 23:30
 * @updateDate 2019/7/23 23:30
 **/
public class NumberThread extends Thread {

    private AlternatePrint alternatePrint;

    public NumberThread(){
    }

    public NumberThread(AlternatePrint alternatePrint){
        this.alternatePrint = alternatePrint;
    }


    @Override
    public void run() {


        while (true){
            Random random = new Random();
            try {
                sleep(1000+random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            alternatePrint.printNumber();
        }

    }


}
