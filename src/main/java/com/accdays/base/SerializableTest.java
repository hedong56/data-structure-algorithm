package com.accdays.base;

import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/18 17:11
 * @updateDate 2019/7/18 17:11
 **/
public class SerializableTest {


    public static void main(String[] args) throws IOException , ClassNotFoundException {
//        FlyPig flyPig=new FlyPig("奔驰","飞猪1","red");
        FlyPig flyPig=new FlyPig("benchi","pig_1","red");

//        serializ(flyPig);

        FlyPig flyPig2=(FlyPig)deserializ();

        System.out.println(JSON.toJSONString(flyPig2));



    }

    //序列化
    static void serializ(Object object)  throws IOException {

        File file=new File("E:/ser.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(object);
        }

    }

    static Object deserializ() throws IOException, ClassNotFoundException {

        Object result=null;

        try( ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:/ser.txt")) ){

            result=objectInputStream.readObject();

        }

        return result;

    }








}


class FlyPig implements Serializable {

    //在属性发生变化后【比如添加字段】，也能够反序列化成功。兼容历史数据
    //有serialVersionUID才可以加字段
    private static final long serialVersionUID = 8358532000092354056L;
    //静态字段不能序列化
    private static String AGE="269";
    // transient 不能序列化
    transient private String carName;


    private String name;
    private String color;
    private String addFile;



    public FlyPig() {
    }

    public FlyPig(String carName, String name, String color) {
        this.carName = carName;
        this.name = name;
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getAddFile() {
        return addFile;
    }

    public void setAddFile(String addFile) {
        this.addFile = addFile;
    }

}


