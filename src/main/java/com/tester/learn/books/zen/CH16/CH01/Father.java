package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Father extends Handler {

    public Father()
    {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void response(IWomen women)
    {
        System.out.println("daughter request:" + women.getRequest());
        System.out.println("father response: OK");
    }

}
