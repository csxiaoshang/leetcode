package main.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-18 下午10:40
 * <p>
 * 类说明：
 */
public class DynamicProxyInvocationHandler implements InvocationHandler {

    private Object source;

    public DynamicProxyInvocationHandler(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before invocation");
        method.invoke(source, args);
        System.out.println("after invocation");
        return null;
    }

    public static void main(String[] args) {
        UserImpl userImpl = new UserImpl();
        DynamicProxyInvocationHandler dynamicProxy = new DynamicProxyInvocationHandler(userImpl);
        User user = (User) Proxy.newProxyInstance(DynamicProxyInvocationHandler.class.getClassLoader(), userImpl.getClass().getInterfaces(), dynamicProxy);
        user.addUser();
        user.delUser();
    }
}
