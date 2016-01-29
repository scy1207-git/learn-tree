package com.tester.learn.books.crazyjava.CH16;

/**
 * Created by leosong on 16-1-29.
 */
public class DrawThread extends Thread {

    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account,double drawAmount)
    {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run()
    {
//        if(account.getBalance() >= drawAmount)
//        {
//            System.out.println(getName() + "get the money" + drawAmount);
//        }
//        try{Thread.sleep(1);}
//        catch(InterruptedException ex)
//        {
//            ex.printStackTrace();
//        }


    }

}
