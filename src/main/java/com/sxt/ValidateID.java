package com.sxt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验身份证号码，并提取出生日期
 */
public class ValidateID {

    public static void main(String[] args) {
        String id="51072319860707441X";
        Pattern pattern=Pattern.compile("^(\\d{6})(\\d{8})(\\d{3})?(\\d|[A-Z])$");
        Matcher matcher = pattern.matcher(id);

        if(matcher.find()){
            System.out.println("匹配");

            System.out.println(matcher.group(2));

        }else{
            System.out.println("不匹配");
        }

    }

}
