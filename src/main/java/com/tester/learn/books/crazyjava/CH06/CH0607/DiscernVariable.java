package com.tester.learn.books.crazyjava.CH06.CH0607;

/**
 * Created by leosong on 16-1-14.
 */
public class DiscernVariable {

    private String prop = "outer class instance";
    private class InClass
    {
        private String prop = "Insider class instance";
        public void info()
        {
            String prop = "jubu variable";
            System.out.println("Outter Class Variable:: " + DiscernVariable.this.prop);
            System.out.println("Insider Class Variable:: " + this.prop);
            System.out.println("prop " + prop);
        }

    }

    public void test()
    {
        InClass ic = new InClass();
        ic.info();
    }

    public static void main(String[] args)
    {
        new DiscernVariable().test();
    }


}
