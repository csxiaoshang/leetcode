package main.java.classloader;

/**
 * @Author 北集
 * @Date 2020/6/15 11:30
 * @Description:
 */
public class A {
    public static String name;
    public static String getName() {
        return name;
    }
    public B b;
    public A(){
        System.out.println(A.class.getClassLoader());
    }
}
