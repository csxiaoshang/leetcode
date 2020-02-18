package main.java.jvm;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-18 下午4:46
 * <p>
 * 类说明：
 */
public class Reference {

    public static void main(String[] args) {
        Reference reference = new Reference();
        System.out.println("符号引用");
        reference.symbolReference();
        System.out.println("直接引用");
        reference.directReference();
    }

    /**
     * 符号引用
     */
    private void symbolReference(){
        String s = "asdf";
        System.out.println("s= "+s);
    }
    /**
     * 直接引用
     */
    private void directReference(){
        System.out.println("s= "+"asdf");
    }
}
