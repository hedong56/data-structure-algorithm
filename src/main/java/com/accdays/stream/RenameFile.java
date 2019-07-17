package com.accdays.stream;

import java.io.File;

/**
 * @author hedong
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/17 11:17
 * @updateDate 2019/7/17 11:17
 **/
public class RenameFile {


    public static void main(String[] args) {
        File file=new File("E:\\CopyFile\\对齐2.png");
        File file2=new File("E:\\CopyFile\\2.png");

        file.renameTo(file2);
    }

}
