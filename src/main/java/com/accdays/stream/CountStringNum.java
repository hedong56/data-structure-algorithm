package com.accdays.stream;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/14 18:46
 * @updateDate 2019/7/14 18:46
 **/
public class CountStringNum {


    public static void main(String[] args) {

        String filePath="E:\\面试\\生成案例存储过程 - 副本.txt";

        System.out.println("个数：  "+countStringNum(filePath, "批次号"));
    }



    public static int countStringNum(String filePath,String key){

        int result = 0;

        Pattern pattern = Pattern.compile(key);



        File file=new File(filePath);

        try (
//                BufferedReader br = new BufferedReader(new FileReader(file))
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"GBK"))
        ) {

            String line=br.readLine();

            while(line!=null){

                System.out.println(line);

                Matcher matcher = pattern.matcher(line);

                while (matcher.find()){
                    result++;
                }


                line=br.readLine();
            }



        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        return result;

    }


}
