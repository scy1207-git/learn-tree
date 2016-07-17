package com.tester.learn.books.javabasiccoder.CH11.CH06;

/**
 * Created by leosong on 16/7/16.
 */
public class SortedBinTreeTest {

    public static void main(String[] args)
    {
        SortedBinTree<Integer> tree = new SortedBinTree<Integer>();
        tree.add(5);
        tree.add(20);
        tree.add(10);
        tree.add(3);
        tree.add(8);
        tree.add(15);
        tree.add(30);
        System.out.println(tree.breadthFirst());
    }

}
