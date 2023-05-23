package com.yy.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/5/18 10:28 下午
 * @Description
 */
public class NioServer {

    private static List<SocketChannel> channelList = new ArrayList<>();

    public static void main(String[] args) {

        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(8888));
            serverSocketChannel.configureBlocking(false);

            while (true) {
                SocketChannel accept = serverSocketChannel.accept();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
