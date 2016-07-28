package com.tester.learn.books.zen.CH32;

/**
 * Created by leosong on 16-7-28.
 */
public class Gzip implements Algorithm {


    public boolean compress(String source,String to)
    {
        System.out.println(source + "-->" + to + "gzip compress ok");
        return true;
    }


    public boolean uncompress(String source, String to)
    {
        System.out.println(source + "-->" + to + "gzip uncompress ok");
        return true;
    }

}
