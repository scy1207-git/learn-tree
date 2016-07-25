package com.tester.learn.books.zen.CH23;

/**
 * Created by leosong on 16-7-25.
 */
public class Facade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();


    public void methodA()
    {
        this.a.doSomethingA();
    }

    public void methodB()
    {
        this.b.doSomethingB();
    }

    public void methodC()
    {
        this.c.doSomethingC();
    }


}
