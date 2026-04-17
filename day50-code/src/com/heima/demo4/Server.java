package com.heima.demo4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建对象绑定1000端口

        ServerSocket ss = new ServerSocket(1000);

        Socket s = ss.accept();

        InputStream inputStream = s.getInputStream();

        InputStreamReader isr = new InputStreamReader(inputStream);
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
    }
}
