package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/23 14:59
 * @updateDate 2019/7/23 14:59
 **/
public class Sub extends Super {

    public long getLength(){
        return 5;
    }

    public static void main(String[] args) {
//        Super super = new Super();

        Super sub = new Sub();

        System.out.println(" ; "+ sub.getLength() );
    }

}


class Super{
    public int getLength(){
        return 4;
    }
}
