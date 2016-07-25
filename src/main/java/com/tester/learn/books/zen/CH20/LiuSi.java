package com.tester.learn.books.zen.CH20;

/**
 * Created by leosong on 16-7-25.
 */
public class LiuSi implements Observer{
    public void update(String str)
    {
        System.out.println("liusi find hanfeizi on the move");
        this.happy(str);
        System.out.println("liusi , is happying");

    }

    private void happy(String context)
    {
        System.out.println("liusi ,because " + context +" so , I am happy");
    }

}