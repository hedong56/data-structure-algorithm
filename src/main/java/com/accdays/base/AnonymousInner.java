package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/10 22:27
 * @updateDate 2019/7/10 22:27
 **/
public class AnonymousInner {

    void outerMehthod(){

        new Sample(){

            @Override
            public void testMethod() {
                System.out.println("匿名内部类：在方法内部直接new 接口，生成对象；再调用接口的方法");
            }

        }.testMethod();


        int y = new Teacher(){
            @Override
            int teach() {
                System.out.println("匿名内部类，抽象类");
                return 2;
            }
        }.teach();

        System.out.println("匿名内部类返回的值：" + y );

    }

    public static void main(String[] args) {
        AnonymousInner ai=new AnonymousInner();
        System.out.println(ai.hashCode());
        ai.outerMehthod();
    }


}


interface Sample{
    void testMethod();
}

abstract class Teacher{
    abstract int teach();
}