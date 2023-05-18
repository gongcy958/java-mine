package com.yy.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gongcy
 * @date 2022/11/17 3:01 下午
 * @Description
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {

            System.out.println("等待连接...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端连接成功...");

            handlerClientSocket(clientSocket);

        }
    }

    private static void handlerClientSocket(Socket socket) {

        byte[] bytes = new byte[1024];

        try {
            int read = socket.getInputStream().read(bytes);
            if (read != -1) {
                System.out.printf("接收到客户端数据 %s ",new String(bytes,0,read));
                socket.getOutputStream().write("消息已收到，勿念!".getBytes());
                socket.getOutputStream().flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
