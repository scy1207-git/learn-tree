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
        switch(this.type)
        {
            case 1:
                this.request = "daughter's request: " + _request;
                break;
            case 2:
                this.request = "wife's request: " + _request;
                break;
            case 3:
                this.request = "mother's request" + _request;
        }

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
