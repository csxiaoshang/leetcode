package main.java.io.blocking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-6 下午2:09
 * <p>
 * 类说明：
 */
public class BlockingClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost",8080));
        ByteBuffer buffer = ByteBuffer.wrap("hello world".getBytes());
        socketChannel.write(buffer);
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int num;
        while((num = socketChannel.read(readBuffer))>0){
            readBuffer.flip();
            byte[] bytes = new byte[num];
            readBuffer.get(bytes);
            String result = new String(bytes, "UTF-8");
            System.out.println("返回值为: "+result);
        }
    }
}
