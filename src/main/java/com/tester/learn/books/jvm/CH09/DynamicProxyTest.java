package com.tester.learn.books.jvm.CH09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by leosong on 16-7-4.
 */
public class DynamicProxyTest {

    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello()
        {
            System.out.println("hello,world");
        }


        static class DynamicProxy implements InvocationHandler {
            Object originalObj;

            Object bind(Object originalObj)
            {

                this.originalObj = originalObj;
                return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),originalObj.getClass().getInterfaces(),this);
            }

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                System.out.println("welcome");
                return method.invoke(originalObj,args);
            }

        }

    public static void main(String[] args)
    {
        IHello hello = (IHello) new DynamicProxy().bind(new Hello());
        hello.sayHello();
    }



    }





}
