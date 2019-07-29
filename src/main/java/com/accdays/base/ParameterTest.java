package com.accdays.base;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/17 22:14
 * @updateDate 2019/7/17 22:14
 **/
public class ParameterTest {


    public static void PersonCrossTest(Person p) {
        System.out.println("传入名字："+p.getName());
//        p=new Person();
        p.setName("方法内新名字");
        System.out.println("新名字："+p.getName());

    }


    public static void main(String[] args){
        Person p = new Person("马化腾",20);
        PersonCrossTest(p);
        System.out.println("调用方法后的名字："+p.getName());

    }


}


class Person{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
