package com.tester.learn.books.crazyjava.CH16;

/**
 * Created by leosong on 16-1-29.
 */
public class SecondThread implements Runnable{
    private int i;

    public void run()
    {
        for(;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


    public static void main(String[] args)
    {
        for(int i =0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            if (i == 20)
            {
                SecondThread st = new SecondThread();
                new Thread(st,"thread1").start();
                new Thread(st, "thread2").start();
            }
        }


    }



}
