package com.heima.demo4;

import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = new Socket("127.0.0.1",1000);

        OutputStream os = socket.getOutputStream();
        os.write();
    }
}
