package com.tester.learn.books.zen.CH20;

/**
 * Created by leosong on 16-7-25.
 */
public class WangSi implements Observer {

    public void update(String str)
    {
        System.out.println("wangsi: find hanfeizi on the move");
        this.cry(str);
        System.out.println("wangsi, is crying");
    }

    private void cry(String context)
    {
        System.out.println("wangsi: because" + context + " so sad!");
    }

}


