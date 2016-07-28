package com.tester.learn.books.zen.CH32;

/**
 * Created by leosong on 16-7-28.
 */
public class Context {

    private Algorithm al;

    public Context(Algorithm _al)
    {
        this.al = _al;
    }

    public boolean compress(String source,String to)
    {
        return al.compress(source,to);
    }



}
