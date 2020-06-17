package main.java.classloader;

/**
 * @Author 北集
 * @Date 2020/6/15 11:30
 * @Description:
 */
public class B {
    public A a;
    public B(){
        System.out.println(B.class.getClassLoader());
    }
}
