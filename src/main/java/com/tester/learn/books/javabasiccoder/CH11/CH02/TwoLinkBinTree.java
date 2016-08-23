package com.tester.learn.books.javabasiccoder.CH11.CH02;

/**
 * Created by leosong on 16-8-15.
 */
public class TwoLinkBinTree<E> {

    public static class TreeNode
    {
        Object data;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}

        public TreeNode(Object data)
        {
            this.data = data;
        }

        public TreeNode(Object data,TreeNode left,TreeNode right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    private TreeNode root;
    public TwoLinkBinTree()
    {
        this.root = root;
    }

    public TwoLinkBinTree(E data)
    {
        this.root  =new TreeNode(data);
    }

    public TreeNode addNode(TreeNode parent,E data,boolean isLeft)
    {
        if(parent ==null)
        {
            throw new RuntimeException(parent + "node is null, cannot add node");
        }
        if(isLeft && parent.left !=null)
        {
            throw new RuntimeException(parent + "node alredy got left node, cannot add left node");
        }
        if(!isLeft && parent.right !=null)
        {
            throw new RuntimeException("node already got right node, cannot add right node");
        }

        TreeNode newNode = new TreeNode(data);
        if(isLeft)
        {
            parent.left = newNode;
        }else
        {
            parent.right = newNode;
        }
        return newNode;

    }

    public boolean empty()
    {
        return root.data == null;
    }

    public TreeNode root()
    {
        if(empty())
        {
            throw new RuntimeException("tree is empty, cannot visit root");
        }
        return root;
    }

    public E parent(TreeNode node)
    {
        return null;
    }






}
