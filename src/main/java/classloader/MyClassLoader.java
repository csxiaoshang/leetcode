package main.java.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @Author 北集
 * @Date 2020/6/15 11:36
 * @Description:
 *
 * todo
 *
 */
public class MyClassLoader extends ClassLoader {

    public MyClassLoader() {

    }
    public MyClassLoader(ClassLoader parent)
    {
        super(parent);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        File file = null;
        try {
            file = getClassFile(name);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        try
        {
            byte[] bytes = getClassBytes(file);
            Class<?> c = this.defineClass(name, bytes, 0, bytes.length);
            return c;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return super.findClass(name);
    }
    private File getClassFile(String name) throws URISyntaxException {
        System.out.println(Main.class.getResource("").toString());
        File file = new File(Main.class.getResource("").toString()+name+".class");
        return file;
    }

    private byte[] getClassBytes(File file) throws Exception
    {
        // 这里要读入.class的字节，因此要使用字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer by = ByteBuffer.allocate(1024);

        while (true)
        {
            int i = fc.read(by);
            if (i == 0 || i == -1) {
                break;
            }
            by.flip();
            wbc.write(by);
            by.clear();
        }

        fis.close();

        return baos.toByteArray();
    }
}
