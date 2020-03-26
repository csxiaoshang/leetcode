package main.java.io.blocking;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-8 下午11:00
 * <p>
 * 类说明：
 */
public class SocketHandler implements Runnable {
    private SocketChannel socketChannel;

    SocketHandler(SocketChannel socketChannel){
        this.socketChannel = socketChannel;
    }
    @Override
    public void run() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int num;
try{
    while((num = socketChannel.read(buffer))>0){
        buffer.flip();
        byte[] bytes = new byte[num];
        buffer.get(bytes);
        String str = new String(bytes,"UTF-8");
        System.out.println("收到请求 "+str);
        ByteBuffer writeBuffer = ByteBuffer.wrap(("我已经收到请求，内容为：" + str).getBytes());
        socketChannel.write(writeBuffer);
        buffer.clear();
    }
}catch(IOException e){
    System.out.println("ioException");
}

    }
}
