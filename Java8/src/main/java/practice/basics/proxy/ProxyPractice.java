package practice.basics.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by takemotto on 11/26/16.
 */
public class ProxyPractice {

    public static void main(String [] args) {
        ProxyTarget target = (ProxyTarget) Proxy.newProxyInstance(ProxyTarget.class.getClassLoader(), new Class[]{ProxyTarget.class}, new MyInvocationHandler());

        System.out.println("name():" + target.name());
        System.out.println("object():" + target.object());

    }


    private interface ProxyTarget {
        public String name();

        public Object object();
    }

    private static class MyInvocationHandler implements InvocationHandler {

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            return method.getName();
        }
    }
}



