package com.tester.learn.books.javabasiccoder.CH11;

/**
 * Created by leosong on 16/7/13.
 */
public class TreeParentTest {


    public static void main(String[] args)
    {
        TreeParent<String> tp = new TreeParent<String>("root");
        TreeParent.Node root = tp.root();
        System.out.println(root);
        tp.addNode("node 1", root);

    }


}
