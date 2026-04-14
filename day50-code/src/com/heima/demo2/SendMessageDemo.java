package com.heima.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建dataSocket对象
        DatagramSocket ds = new DatagramSocket();

        String str = "hello,udp";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(
                bytes,
                bytes.length,
                address,
                port
        );
        ds.send(dp);
        ds.close();
    }
}
