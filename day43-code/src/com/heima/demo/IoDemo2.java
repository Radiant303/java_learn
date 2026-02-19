package com.heima.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day43-code\\a.txt", true);

        byte[] bytes = {97,98,99};
        fos.write(bytes,1,2);

        String str = "hello world";
        byte[] bytes1 = str.getBytes();

        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);
        fos.write(bytes1);

        fos.close();

    }
}
