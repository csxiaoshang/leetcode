package main.java.interfacetest;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-10 下午5:21
 * <p>
 * 类说明：
 */
public class Man implements Person {

    public void test(){

    }

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    public static void main(String[] args) {
        Animal animal = new Man();
        ((Man) animal).test();
    }
}
