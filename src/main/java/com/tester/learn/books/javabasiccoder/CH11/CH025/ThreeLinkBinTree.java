package com.tester.learn.books.javabasiccoder.CH11.CH025;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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


    public List<TreeNode> preIterator()
    {
        return preIterator(root);
    }

    private List<TreeNode> preIterator(TreeNode node)
    {
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(node);
        if(node.left!=null)
        {
            list.addAll(preIterator(node.left));
        }
        if(node.right!= null)
        {
            list.addAll(preIterator(node.right));
        }

        return list;
    }

    public List<TreeNode> inIterator()
    {
        return inIterator(root);
    }

    private List<TreeNode> inIterator(TreeNode node)
    {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(node.left != null)
        {
            list.addAll(inIterator(node.left));
        }

        list.add(node);
        if(node.right!=null)
        {
            list.addAll(inIterator(node.right));
        }
        return list;
    }

    public List<TreeNode> postIterator()
    {
        return postIterator(root);
    }

    private List<TreeNode> postIterator(TreeNode node)
    {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(node.left != null)
        {
            list.addAll(postIterator(node.left));
        }
        if(node.right !=null)
        {
            list.addAll(postIterator(node.right));
        }
        list.add(node);
        return list;

    }

    public List<TreeNode> breadthFirst()
    {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<TreeNode> list = new ArrayList<TreeNode>();

        if(root!=null)
        {
            queue.offer(root);
        }

        while(!queue.isEmpty())
        {
            list.add(queue.peek());
            TreeNode p = queue.poll();
            if(p.left !=null)
            {
                queue.offer(p.left);
            }
            if(p.right != null)
            {
                queue.offer(p.right);
            }

        }

        return list;



    }





}

