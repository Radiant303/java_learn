package com.heima.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo {
    public static void main(String[] args) throws IOException {
        File src = new File("day45-code\\a.txt");
        File dest = new File("day45-code");
        toZip(src, dest);
    }
    public static void toZip(File src, File dest) throws IOException {
        //1.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));

        //2.创建zipEntry对象
        ZipEntry ze = new ZipEntry(src.getName());

        //3.把ZipEntry对象添加到ZipOutputStream对象中
        zos.putNextEntry(ze);

        //4.把文件写入ZipOutputStream对象中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
