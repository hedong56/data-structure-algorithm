package com.sxt.demian;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -9194151318295615896L;

    private String id;

    private String name;
    //年级
    private String grade;

    public Student() {
    }


    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
