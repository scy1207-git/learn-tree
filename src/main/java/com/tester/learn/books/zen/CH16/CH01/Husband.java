package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Husband extends Handler {

    public Husband()
    {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    protected void response(IWomen women)
    {
        System.out.println("wife request: " + women.getRequest());
        System.out.println("Husband agree!");
    }

}
