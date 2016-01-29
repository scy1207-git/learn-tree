package com.tester.learn.books.crazyjava.CH16;

/**
 * Created by leosong on 16-1-29.
 */
public class YieldTest extends Thread {

    public YieldTest(String name)
    {
        super(name);
    }

    public void run()
    {
        for(int i =0; i <50; i++)
        {
            System.out.println(getName() + " " + i);
            if (i == 20)
            {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args)
    {
        YieldTest yt1 = new YieldTest("gaoji");
        yt1.start();

        YieldTest yt2 = new YieldTest("diji");
        yt2.start();



    }



}
