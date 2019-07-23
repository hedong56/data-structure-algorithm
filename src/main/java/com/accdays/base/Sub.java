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
    //方法的重载是通过参数的差异来区分  Overload
    //方法的覆盖要求返回值，函数名，参数列表完全一样 Overrider
//    public long getLength(){
//        return 5;
//    }

    public long getLength(int x){
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
