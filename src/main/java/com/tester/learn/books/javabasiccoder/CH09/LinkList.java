package com.tester.learn.books.javabasiccoder.CH09;

/**
 * Created by leosong on 16-1-22.
 */
public class LinkList<T> {

    private class Node
    {
        private T data;
        private Node next;
        public Node(){
        }

        public Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private Node header;
    private Node tail;
    private int size;
    public LinkList(){

    }


}
