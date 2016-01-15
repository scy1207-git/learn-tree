package com.tester.learn.books.crazyjava.CH06.CH0607;

/**
 * Created by leosong on 16-1-14.
 */
public class Outer {
    private int outProp = 9;
    class Inner
    {
        private int inProp = 5;
        public void acessOuterProp()
        {
            System.out.println("Outer Prop:" + outProp);
        }
    }

    public void accessInnerProp()
    {
        System.out.println("Insider prop:" + new Inner().inProp);
    }

    public static void main(String[] args)
    {
       Outer outer = new Outer();
       // outer.accessInnerProp();

    }

}
