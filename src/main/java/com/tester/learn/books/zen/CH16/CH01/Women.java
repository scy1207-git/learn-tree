package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Women implements IWomen {

    private int type = 0;
    private String request = "";
    public Women(int _type, String _request)
    {
        this.type = _type;
        this.request = _request;

    }


    public int getType()
    {
        return this.type;
    }

    public String getRequest()
    {
        return this.request;
    }



}
