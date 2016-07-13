package com.tester.learn.books.javabasiccoder.CH10;

/**
 * Created by leosong on 16/7/13.
 */
public class LinkQueue<T> {

    private class Node
    {
        private T data;
        private Node next;
        public Node(){}
        public Node(T data,Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public LinkQueue()
    {
        front = null;
        rear = null;
    }

    public LinkQueue(T element)
    {
        front = new Node(element,null);
        rear = front;
        size ++;
    }
    public int length()
    {
       return size;
    }

    public void add(T element)
    {
        if(front ==null)
        {
            front = new Node(element,null);
            rear = front;
        }else
        {
            Node newNode = new Node(element,null);
            rear.next = newNode;
            rear = newNode;
        }

    }

    public T remove()
    {
        Node oldFront = front;
        front = front.next;
        oldFront.next = null;
        size --;
        return oldFront.data;
    }

    public boolean empty()
    {
        return size ==0;
    }

    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    public String toString()
    {
        if(empty())
        {
            return "[]";
        }else
        {
            StringBuilder sb = new StringBuilder("[");
            for(Node current = front;current!=null;current = current.next)
            {
                sb.append(current.data+ ", ");
            }
            int len = sb.length();
            return sb.delete(len -2,len).append("]").toString();

        }


    }






}
