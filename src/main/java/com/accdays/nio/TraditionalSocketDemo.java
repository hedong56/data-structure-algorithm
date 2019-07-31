package com.accdays.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hedong
 * @version 1.0
 * @description 传统的socket连接是阻塞型的，一个服务器只能连接一个客户端。
 * @updateRemark
 * @updateUser
 * @createDate 2019/7/31 17:01
 * @updateDate 2019/7/31 17:01
 **/
public class TraditionalSocketDemo {


    public static final int SOCKET_PORT = 7777;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(SOCKET_PORT);

        System.out.println("服务端启动...端口为7777");


        while ( true ){

            // 阻塞
            Socket socket = serverSocket.accept();

            System.out.println("有新的客户端连接上来了...");

            InputStream inputStream = socket.getInputStream();

            byte[] b = new byte[1024] ;

            while ( true ){
                //阻塞点
                int length = inputStream.read(b);

                if(length != -1){
                    String msg = new String( b , 0 ,length , "GBK" );

                    System.out.println(msg);
                }else {
                    break;
                }


            }



        }


    }


}
