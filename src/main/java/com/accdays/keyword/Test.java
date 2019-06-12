package com.accdays.keyword;

/**
 * 执行顺序：
 *  1. 先 static 块
 *  2. 实例化 属性字段
 *  3. 构造方法
 *  4. 先父类再子类
 */
public class Test {
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


