package com.heima.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char)b);
        }
        socket.close();
        ss.close();
    }
}
