package com.tester.learn.books.javabasiccoder.CH11.CH025;

/**
 * Created by leosong on 16/7/14.
 */
public class ThreeLinkBinTree<E> {

    public static class TreeNode
    {
        Object data;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode() {}

        public TreeNode(Object data)
        {
            this.data = data;
        }
        public TreeNode(Object data, TreeNode left,TreeNode right, TreeNode parent)
        {
            this.data =data;
            this.left =left;
            this.right = right;
            this.parent = parent;
        }

    }

    private TreeNode root;
    public ThreeLinkBinTree()
    {
        this.root = new TreeNode();
    }

    public ThreeLinkBinTree(E data)
    {
        this.root = new TreeNode(data);
    }

    public TreeNode addNode(TreeNode parent,E data, boolean isLeft)
    {
        if(parent == null)
        {
            throw new RuntimeException("parent is null ,cannot add sub node");
        }
        if(isLeft && parent.left != null)
        {
            throw new RuntimeException("parent had a left node, cannot add more");
        }
        if (!isLeft && parent.right != null)
        {
            throw new RuntimeException("parent had a right node,cannot add more");
        }

        TreeNode newNode = new TreeNode(data);
        if(isLeft)
        {
            parent.left = newNode;
        }else
        {
            parent.right = newNode;
        }
        newNode.parent = parent;
        return newNode;
    }

    public boolean empty()
    {
        return root.data == null;
    }

    public TreeNode root()
    {
        if (empty())
        {
            throw new RuntimeException("tree is empty, cannot visit root");
        }
        return root;
    }




}
