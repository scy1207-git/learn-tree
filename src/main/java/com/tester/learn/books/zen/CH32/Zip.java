package com.tester.learn.books.zen.CH32;

/**
 * Created by leosong on 16-7-28.
 */
public class Zip implements Algorithm {

    public boolean compress(String source,String to)
    {
        System.out.println(source + "-->" + to + "zip compress ok");
        return true;
    }


    public boolean uncompress(String source, String to)
    {
        System.out.println(source + "-->" + to + "zip uncompress ok");
        return true;
    }



}
