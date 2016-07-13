package com.tester.learn.books.javabasiccoder.CH11.CH01;

import com.tester.learn.books.javabasiccoder.CH11.CH01.TreeParent;

import java.util.List;

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
        System.out.println("tree's deep: " + tp.deep());
        tp.addNode("node2", root);
        List<TreeParent.Node<String>> nodes = tp.children(root);
        System.out.println("first node : " + nodes.get(0));



    }


}
