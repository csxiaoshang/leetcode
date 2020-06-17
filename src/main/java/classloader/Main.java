package main.java.classloader;

/**
 * @Author 北集
 * @Date 2020/6/15 11:29
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        A a = new A();
        B b = new B();
        a.b = b;
        b.a = a;
        ClassLoader classLoader = new MyClassLoader(ClassLoader.getSystemClassLoader().getParent());
        Class clazz = classLoader.loadClass("A");
        System.out.println(clazz == A.class); // false
        Object clA = clazz.newInstance();

        // A thisA = (A) clA; // error
        // B.a = clA // error
    }
    }
