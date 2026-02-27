package com.heima.zip;
import cn.hutool.core.io.FileUtil;

import java.io.File;

public class HuToolDemo {
    public static void main(String[] args) {
        File src = FileUtil.file("day45-code","c.txt");
        File torch = FileUtil.touch(src);
        System.out.println(torch);
    }
}
