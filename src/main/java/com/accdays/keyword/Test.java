package com.accdays.keyword;

/**
 * 执行顺序：
 *  1. 先 static 块
 *  2. {}代码块、实例化属性字段 相同执行级别，按照代码顺序执行
 *  3. 构造方法
 *  4. 先父类再子类
 */
public class Test {

    {
        //代码域中定义的变量都是局部的，只有域中的代码可以调用。
        String str="直接大括号";
        System.out.println(str);
    }

    Person person = new Person("Test");

    static{
        System.out.println("test static");
    }

    public Test() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}

class MyClass extends Test {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}

class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}


