package com.tester.learn.books.javabasiccoder.CH11.CH03;

/**
 * Created by leosong on 16/7/13.
 */
public class TwoLinkBinTree<E> {

    public static class TreeNode
    {
        Object data;
        TreeNode left;
        TreeNode right;

        public TreeNode()
        {

        }

        public TreeNode(Object data)
        {
            this.data = data;
        }

        public TreeNode(Object data,TreeNode left, TreeNode right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    private TreeNode root;

    public TwoLinkBinTree()
    {
        this.root = new TreeNode();
    }

    public TwoLinkBinTree(E data)
    {
        this.root = new TreeNode(data);
    }

    public TreeNode addNode(TreeNode parent, E data, boolean isLeft)
    {
        if (parent == null)
        {
            throw new RuntimeException(parent + "node is null, cannot add sub node");
        }
        if(isLeft && parent.left != null)
        {
            throw new RuntimeException(parent + "node has already left node, cannot add left node");
        }
        if(!isLeft && parent.right!= null)
        {
            throw new RuntimeException(parent + "node has already right noe, cannot add right node");
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

    @SuppressWarnings("unchecked")
    public E leftChild(TreeNode parent)
    {
        if(parent == null)
        {
            throw new RuntimeException(parent + "node is null, cannot add sub node");
        }

        return parent.left ==null ?null: (E)parent.left.data;
    }

    @SuppressWarnings("unchecked")
    public E rightChild(TreeNode parent)
    {
        if(parent == null)
        {
            throw new RuntimeException(parent + "node is null, cannot add sub node");
        }
        return parent.right == null ?null : (E) parent.right.data;

    }

    public int deep()
    {
        return deep(root);
    }

    private int deep(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }
        if (node.left ==null && node.right == null)
        {
            return 1;
        }else
        {
            int leftDeep = deep(node.left);
            int rightDeep = deep(node.right);
            int max = leftDeep > rightDeep ? leftDeep:rightDeep;
            return max +1;
        }


    }




}
