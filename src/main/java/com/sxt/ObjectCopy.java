package com.sxt;

import com.alibaba.fastjson.JSON;
import com.sxt.demian.Student;

import java.io.*;


/**
 * 深度复制对象
 */
public class ObjectCopy {

    public static void main(String[] args) {

        Student student=new Student("1","张三","三年级");

        Student student1=copyObject(student);

        System.out.println(JSON.toJSONString(student1));
    }

    /**
     * <T> 表明该方法将使用泛型类型T
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T copyObject(T t){

        T result=null;


        /**
         * 多个资源对象，则可以使用多个try catch捕获
         */
        try(

                //将对象转换为字节
                ByteArrayOutputStream bos=new ByteArrayOutputStream();
                ObjectOutputStream oos=new ObjectOutputStream(bos)

        ){

            oos.writeObject(t);
            oos.flush();

            try (
                //将字节再转换为对象
                ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))
            ){

                result=(T)ois.readObject();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

/*

        try {

            //将对象转换为字节
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream out=new ObjectOutputStream(bos);

            out.writeObject(t);
            out.flush();
            bos.close();
            out.close();

            //将字节再转换为对象
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);

            result=(T)ois.readObject();
            ois.close();
            bis.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        return result;

    }
}
