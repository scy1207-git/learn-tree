package com.tester.learn.books.javabasiccoder.CH11;

/**
 * Created by dingshan on 16/7/13.
 */
public class TreeChild<E> {

    private static class SonNode
    {
        private int pos;
        private SonNode next;
        public SonNode(int pos,SonNode next)
        {
            this.pos = pos;
            this.next = next;
        }
    }


    public static class Node<T>
    {
        T data;
        SonNode first;

        public Node(T data)
        {
            this.data = data;
            this.first = null;
        }

        public String toString()
        {
            if(first !=null)
            {
                return "TreeChild$Node[data=" + data + ",first=" + first.pos + "]";
            }else
            {
                return "TreeChild$Node[data=" + data + ",first=-1]";
            }

        }

    }


    private final int DEFAULT_TREE_SIZE =100;
    private int treeSize = 0;
    private Node<E>[] nodes;
    private int nodeNums;

    @SuppressWarnings("unchecked")
    public TreeChild(E data)
    {
        treeSize = DEFAULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }



    @SuppressWarnings("unchecked")
    public TreeChild(E data,int treeSize)
    {
        this.treeSize = treeSize;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    public void addNode(E data, Node parent)
    {
        for(int i =0;i<treeSize;i++)
        {
            if(nodes[i] == null)
            {
                nodes[i] = new Node<E>(data);
                if (parent.first == null)
                {

                }else
                {

                }
                nodeNums++;
                return;
            }
        }throw new RuntimeException("tree is full!");
    }


    public boolean empty()
    {
        return nodes[0] == null;
    }

    public Node<E> root()
    {
        return nodes[0];

    }




}
