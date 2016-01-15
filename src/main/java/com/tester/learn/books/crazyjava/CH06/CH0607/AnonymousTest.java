package com.tester.learn.books.crazyjava.CH06.CH0607;

/**
 * Created by leosong on 16-1-14.
 */

interface Product
{
    public double getPrice();
    public String getName();
}


public class AnonymousTest {

    public void test(Product p)
    {
        System.out.println(p.getName() + p.getPrice());
    }


    public static void main(String[] args)
    {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product()
        {
            public double getPrice()
            {
                return 567.8;
            }
            public String getName()
            {
                return "AGP";
            }
        });
    }


}
