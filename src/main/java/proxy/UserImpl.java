package main.java.proxy;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-18 下午10:38
 * <p>
 * 类说明：
 */
public class UserImpl  implements User{
    @Override
    public void addUser() {
        System.out.println("add User");
    }
}
