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
        ServerSocket socket = new ServerSocket(9000);

        while (true) {
            System.out.println("wait connection . ");
            Socket clientSocket = socket.accept();

            System.out.println("already connected . ");
            handler(clientSocket);
        }

    }

    private static void handler(Socket clientSocket) throws IOException {
        byte[] bytes = new byte[1024];
        System.out.println("ready read . ");
        int read = clientSocket.getInputStream().read(bytes);
        System.out.println("read done . ");
        if (read != -1) {
            System.out.println("accept data from client : " + new String(bytes,0,read));
        }

        clientSocket.getOutputStream().write("hello client ".getBytes());
        clientSocket.getOutputStream().flush();
    }
}
