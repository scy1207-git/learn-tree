package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public interface IHandler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST =2;
    public final static int SON_LEVEL_REQUEST =3;

    public void HandleMessage(IWomen women);

}
