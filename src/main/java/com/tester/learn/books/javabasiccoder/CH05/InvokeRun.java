package com.tester.learn.books.javabasiccoder.CH05;

/**
 * Created by leosong on 16-1-21.
 */
public class InvokeRun extends Thread {

    private int i;
    public void run()
    {
        for(int i =0 ;i<100; i++)
        {
            System.out.println("Integer i : " + i );
        }
    }

    public static void main(String[] args)
    {
        for(int i=0;i< 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i );
            if (i == 20 )
            {
                new InvokeRun().start();
                new InvokeRun().start();
            }
        }
    }



}
