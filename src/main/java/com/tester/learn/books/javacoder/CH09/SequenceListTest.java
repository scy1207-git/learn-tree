package com.tester.learn.books.javacoder.CH09;

/**
 * Created by leosong on 16-1-22.
 */
public class SequenceListTest {

    public static void main(String[] args)
    {
        SequenceList<String> list = new SequenceList<String>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
        list.insert("dddd",1);
        System.out.println(list);

    }

}
