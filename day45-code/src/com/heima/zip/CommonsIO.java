package com.heima.zip;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIO {
    public static void main(String[] args) throws IOException {
        File src = new File("day45-code\\a.txt");
        File dest = new File("day45-code\\a_copy.txt");
        FileUtils.copyFile(src, dest);
    }
}
