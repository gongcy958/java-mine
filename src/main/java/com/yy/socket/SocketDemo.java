package com.yy.socket;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author gongcy
 * @date 2022/11/17 1:56 下午
 * @Description
 */
public class SocketDemo {

    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(9999);
        socket.accept();
        System.out.println("hello socket");
    }
}
