package com.tester.learn.books.javabasiccoder.CH11.CH01;

import com.tester.learn.books.javabasiccoder.CH11.CH01.TreeChild;

/**
 * Created by dingshan on 16/7/13.
 */
public class TreeChildTest {


    public static void main(String[] args)
    {
        TreeChild<String> tp = new TreeChild<String>("root");
        System.out.println(tp);
        TreeChild.Node root = tp.root();
        System.out.println("root: " + root);
    }

}
