package com.tester.learn.books.zen.CH17.CH17_03;

/**
 * Created by leosong on 16-8-3.
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component _component)
    {
        super(_component);
    }

    private void method1()
    {
        System.out.println("method1 xiushi");
    }

    public void operate()
    {
        this.method1();
        super.operate();
    }


}
