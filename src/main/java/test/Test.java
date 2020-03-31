package main.java.test;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-16 下午10:22
 * <p>
 * 类说明：
 */
public class Test {
    static int b;

    public static void main(String[] args) throws InterruptedException {

        String a = "asdgc";
        System.out.println(a);
        int tem = 0;
        Test test = new Test();
        test.update(tem);
        System.out.println(tem);
    }
    private void update(int tem){
        tem = 1;
    }

}


