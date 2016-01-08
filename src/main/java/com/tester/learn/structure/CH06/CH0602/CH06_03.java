package com.tester.learn.structure.CH06.CH0602;

import java.io.*;

class TreeNode{
    int value;
    TreeNode left_Node;
    TreeNode right_Node;
    public TreeNode(int value){
        this.value = value;
        this.left_Node = null;
        this.right_Node = null;
    }
}

class BinaryTree{
    public TreeNode rootNode;

    public void Add_Node_To_Tree(int value)
    {
        if (rootNode ==null)
        {
            rootNode = new TreeNode(value);
            return;
        }
        TreeNode currentNode = rootNode;
        while(true)
        {
            if(value < currentNode.value)
            {
                if(currentNode.left_Node == null)
                {
                    currentNode.left_Node = new TreeNode(value);
                    return;
                }else
                {
                    currentNode = currentNode.left_Node;
                }
            }else
            {
                if(currentNode.right_Node == null)
                {
                    currentNode.right_Node = new TreeNode(value);
                    return;
                }else
                {
                    currentNode =currentNode.right_Node;

                }
            }

        }
    }

    public void InOrder(TreeNode node)
    {
        if(node!=null)
        {
            InOrder(node.left_Node);
            System.out.println("[" + node.value + "]");
            InOrder(node.right_Node);
        }
    }

    public void PreOrder(TreeNode node)
    {
        if(node!=null)
        {
            System.out.print("[" + node.value + "]");
            PreOrder(node.left_Node);
            PreOrder(node.right_Node);
        }
    }

    public void PostOrder(TreeNode node)
    {
        if(node!=null)
        {
            PostOrder(node.left_Node);
            PostOrder(node.right_Node);
            System.out.println("[" + node.value + "]");
        }
    }


}


/**
 * Created by U0138272 on 1/1/2016.
 */
public class CH06_03 {

    public static void main(String args[]) throws IOException
    {
        int i;
        int arr[] ={7,4,1,5,16,8,11,12,15,9,2};
        BinaryTree tree =  new BinaryTree();
        System.out.println("Original data: \n");

        for(i=0;i<11;i++)
        {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();

        for(i=0;i<arr.length;i++)
        {
            tree.Add_Node_To_Tree(arr[i]);
        }

        System.out.print("PreOrder:");
        tree.PreOrder(tree.rootNode);


    }

}
