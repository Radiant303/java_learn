package com.heima.demo4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1000);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入");
            String line = sc.nextLine();
            if ("886".equals(line)) {
                break;
            }
            os.write(line.getBytes(StandardCharsets.UTF_8));
        }
        socket.close();
    }
}
