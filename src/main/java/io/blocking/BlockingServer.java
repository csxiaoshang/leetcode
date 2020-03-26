package main.java.io.blocking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-8 下午10:50
 * <p>
 * 类说明：
 */
public class BlockingServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
        while(true){
           SocketChannel socketChannel =  serverSocketChannel.accept();
            SocketHandler socketHandler = new SocketHandler(socketChannel);
            new Thread(socketHandler).start();
        }
    }

}

