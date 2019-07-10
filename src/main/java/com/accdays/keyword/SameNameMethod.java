package com.accdays.keyword;

/**
 * @author hedong
 * @version 1.0
 * @description     1）方法的重载是通过参数来，区分的，不能通过返回值，
 *                  如下代码不能通过编译,updatePerson
 *                  2）调用重载方法的原则是：先"精确"匹配，再按“自动类型转换”匹配
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/10 14:55
 * @updateDate 2019/7/10 14:55
 **/
public class SameNameMethod {

    int updatePerson(){
        return 0;
    }


//    Person updatePerson(){
//        return null;
//    }

}

class A{

    void test(int x){
        System.out.println("test(int):"+ x);
    }

    void test(long x){
        System.out.println("test(long):"+ x);
    }

    void test(float x){
        System.out.println("test(float):"+ x);
    }

    void test(A x){
        System.out.println("test(float):"+ x);
    }


    public static void main(String[] args) {
        A a1 = new A();
        a1.test(5);
        // 实数 默认类型是double双精度类型 8 个字节（B,byte），不是浮点型float(4B), 使用浮点型必须需要指明f结尾
        a1.test(5.0f);

        /*
        结果：
        test(int):5
        test(float):5.0


        如果 test(int x) 被注释
        结果
        test(long):5
        test(float):5.0
        */

    }


}


class B extends A{

    /**
    * @description  覆盖后，将在子类中隐藏父类方法
    * @param x :
    * @return      void
    * @author      hedong
    * @date        2019/7/10 15:24
    **/
    @Override
    void test(int x){
        System.out.println("B.test(int):"+x);
    }

    void test(short x){
        System.out.println("B.test(int):"+x);
    }


    void test(double x){
        System.out.println("B.test(int):"+x);
    }


    void test(B x){
        System.out.println("test(float):"+ x);
    }

    /*
        编译不能通过
        再次说明，不能通过返回值，实现多态
    int test(int x){
        return x;
    }
    */

    int test(int x,int y){
        return x+y;
    }


}


