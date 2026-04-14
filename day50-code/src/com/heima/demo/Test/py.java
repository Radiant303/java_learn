package com.heima.demo.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class py {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("DESKTOP-P0N6JOF");
        System.out.println(byName);

        String ip = byName.getHostAddress();
        System.out.println(ip);

    }
}
