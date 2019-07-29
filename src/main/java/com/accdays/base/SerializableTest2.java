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
public class SerializableTest2 {


    public static void main(String[] args) throws IOException , ClassNotFoundException {

        MathBook mathBook=new MathBook();

        mathBook.setName("数学");
        mathBook.setPrice(33);
        mathBook.setType("理科");

        serializ(mathBook);




        MathBook mathBook2=(MathBook)deserializ();

        System.out.println(JSON.toJSONString(mathBook2));



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


class  Book {

//    private static final long serialVersionUID = -2114966320065695465L;
    private String name;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class MathBook extends Book implements Serializable   {
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

