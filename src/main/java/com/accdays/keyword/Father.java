package com.accdays.keyword;

/**
 * 类中代码的执行顺序：
 * 1. 加载时：static 块会执行一次，且以后不会再执行
 * 2. {}代码块、实例化属性字段 ： 相同执行级别，按照代码顺序执行
 * 3. 构造函数
 * 如果有父类，先按照上面顺序执行父类的代码
 *
 * 执行顺序：
 * 1. 先父类再子类
 * 2. 先 static 块【只执行一次】
 * 3. 父类：
 * 3. {}代码块、实例化属性字段 ： 相同执行级别，按照代码顺序执行
 * 4. 构造函数
 * 5. 子类重复父类的执行顺序
 *
 * 执行顺序：
 *  1. 先 static 块。先当前类，再需要实例化的类。
 *  2. {}代码块、实例化属性字段 相同执行级别，按照代码顺序执行
 *  3. 先父类无参构造方法【子类在自己的构造方法中，没有明确的用super调用父类的构造方法时，则先调用父类的无参构造方法】
 *  4. 实例化自己类的属性
 *  4. 先父类再子类
 */
public class Father {


    {
        //代码域中定义的变量都是局部的，只有域中的代码可以调用。
        System.out.println("代码域大括号{}");
    }

    Person person = new Person("Father");

    static{
        System.out.println("father static");
    }

    public Father() {
        System.out.println("father 构造方法");
    }

    public static void main(String[] args) {
        new Children();
//        new Father();
    }
}

class Children extends Father {
    Person person = new Person("Children");
    static{
        System.out.println("children static");
    }

    public Children() {
        System.out.println("children 构造方法");
    }
}


class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("属性位置: "+str);
    }
}

class Grandfather{

    static {
        System.out.println("Grandfather static");
    }

    private Person p=new Person("Grandfather");

    public Grandfather() {
        System.out.println("Grandfather 构造方法");
    }
}


