package com.accdays.stream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/14 18:14
 * @updateDate 2019/7/14 18:14
 **/
public class CopyFile {

    public static void main(String[] args) {
        String srcPath= JOptionPane.showInputDialog("源文件路径") ;
        String direct=JOptionPane.showInputDialog("目标文件夹") ;
        copyFile(srcPath,direct);
    }


    public static void copyFile(String srcPath,String direct){

        File file=new File(srcPath);

        if (!file.isDirectory() && file.exists() ){
            String fileName = file.getName();

            File folder=new File(direct);
            if (!folder.exists()){
                folder.mkdirs();
            }

            String targetPath=direct+File.separator+fileName;

            File targetFile = new File(targetPath);



            try (
                    FileInputStream fis=new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(targetFile)
            ) {

                byte[] bytes = new byte[100];

                while (fis.read(bytes) != -1) {

                    fos.write(bytes);
                    fos.flush();

                }
            }catch (IOException ioe){
                ioe.printStackTrace();
            }

            System.out.println("复制结束");

        }


    }

}
