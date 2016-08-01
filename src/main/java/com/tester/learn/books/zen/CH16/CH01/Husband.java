package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Husband implements IHandler {

    public void HandleMessage(IWomen women)
    {
        System.out.println("wife request: " + women.getRequest());
        System.out.println("Husband agree!");
    }


}
