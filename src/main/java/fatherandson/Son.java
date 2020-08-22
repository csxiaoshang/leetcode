package main.java.fatherandson;

/**
 * @Author 北集
 * @Date 2020/7/24 15:17
 * @Description:
 */

public class Son extends Father {

    public static void main(String[] args) {
        Son son = new Son();
        son.setSonName("son");
        son.setName("father");
        System.out.println(son);
        int num = 1;
        switch (num) {
            case 1:
            case 2:{
                System.out.println(2);
                break;
            }
            default:{
                System.out.println("default");
            }
        }
    }

    @Override
    public String toString() {
        return "Son{" +
            "sonName='" + sonName + '\'' +
            ", sex=" + sex +
            '}';
    }

    private String sonName;


    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
}
