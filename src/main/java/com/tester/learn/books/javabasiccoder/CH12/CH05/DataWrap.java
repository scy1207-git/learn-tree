package com.tester.learn.books.javabasiccoder.CH12.CH05;

/**
 * Created by leosong on 16/7/21.
 */
public class DataWrap implements Comparable<DataWrap> {

    int data;
    String flag;
    public DataWrap(int data, String flag)
    {
        this.data = data;
        this.flag = flag;
    }
    public String toString()
    {
        return data+flag;
    }

    public int compareTo(DataWrap dw)
    {
        return this.data > dw.data? 1: (this.data == dw.data ? 0: -1);
    }


}
