package com.tester.learn.books.javabasiccoder.CH11.CH07;

/**
 * Created by dingshan on 16/7/17.
 */
public class RedBlackTree <T extends Comparable>{

    private static final boolean RED = false;
    private static final boolean BLACK = true;

    static class Node{
        Object data;
        Node parent;
        Node left;
        Node right;
        boolean color = BLACK;
        public Node(Object data,Node parent,Node left,Node right)
        {
            this.data = data;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
        public String toString()
        {
            return "[data]=" + data + ",color=" + color + "]";
        }

        public boolean equals(Object obj)
        {
            if(this == obj)
            {
                return true;
            }
            if(obj.getClass() == Node.class)
            {
                Node target = (Node) obj;
                return data.equals(target.data) && color ==target.color && left ==target.left && right== target.right && parent ==target.parent;
            }
            return false;
        }
    }

    private Node root;

    public RedBlackTree()
    {
        root = null;
    }

    public RedBlackTree(T o)
    {
        root = new Node(o,null,null,null);
    }

    public void add(T ele)
    {
        if(root == null)
        {
            root =  new Node(ele,null,null,null);
        }else
        {
            Node current = root;
            Node parent  = null;
            int cmp = 0;
            do
            {
                parent = current;
                cmp = ele.compareTo(current.data);
                if(cmp > 0)
                {
                    current = current.right;
                }else
                {
                    current = current.left;
                }
            }while(current !=null);

            while(current != null);






        }





    }







    public static void main(String[] args)
    {
        System.out.println("ok");
    }

}
