package com.yy.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @author gongcy
 * @date 2022/11/17 5:36 下午
 * @Description
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8888);
        socket.getOutputStream().write("who are you ? ".getBytes());
        socket.getOutputStream().flush();

        byte[] bytes = new byte[1024];
        int read = socket.getInputStream().read(bytes);
        if (read != -1) {
            System.out.println("服务端返回数据,");
        }

    }
}
