package com.tester.learn.books.javabasiccoder.CH04.CH01;

/**
 * Created by leosong on 16-7-19.
 */
class Node
{
    Node next;
    String name;
    public Node(String name)
    {
        this.name = name;
    }
}


public class NodeTest {

    public static void main(String[] args)
    {
        Node n1 = new Node("first node");
        Node n2 = new Node("second node");
        Node n3 = new Node("third node");
        n1.next = n2;
        n3 = n2;
        n2 = null;
    }

}
