package com.yy.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gongcy
 * @date 2022/11/17 3:01 下午
 * @Description
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket();
        while (true) {
            System.out.println("wait connection . ");
            Socket clientSocket = socket.accept();
            System.out.println("already connected . ");
            handler(clientSocket);
        }

    }

    private static void handler(Socket clientSocket) {

    }
}
