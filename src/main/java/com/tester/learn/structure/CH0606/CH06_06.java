package com.tester.learn.structure.CH0606;

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


class BinarySearch {

    public TreeNode rootNode;
    public static int count = 1;

    public void Add_Node_To_Tree(int value) {
        if (rootNode == null) {
            rootNode = new TreeNode(value);
            return;
        }

        TreeNode currentNode = rootNode;

        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left_Node == null) {
                    currentNode.left_Node = new TreeNode(value);
                    return;
                } else currentNode = currentNode.left_Node;
            } else {
                if (currentNode.right_Node == null) {
                    currentNode.right_Node = new TreeNode(value);
                    return;
                } else currentNode = currentNode.right_Node;

            }
        }
    }

    public boolean findTree(TreeNode node, int value)
    {
        if(node == null)
         {
            return false;
        }else if (node .value == value)
        {
            System.out.print("Totally search for " + count + " Times");
            return true;
        }else if (value < node.value)
        {
            count += 1;
            return findTree(node.left_Node,value);
        }else
        {
            count =+1;
            return findTree(node.right_Node,value);
        }
    }


}

/**
 * Created by U0138272 on 1/3/2016.
 */
public class CH06_06 {

    public static void main(String args[]) throws IOException
        {
            int i,value;
            int arr[] = {7,4,1,5,13,8,11,12,15,9,2};
            System.out.print("Original Data: \n" );
            for(i=0;i<arr.length;i++) System.out.print("[" + arr[i] + "]");

            System.out.println();
            BinarySearch tree = new BinarySearch();
            for(i=0;i<11;i++) tree.Add_Node_To_Tree(arr[i]);

            System.out.print("Pls input the search value: ");
            BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
            value = Integer.parseInt(keyin.readLine());
            if(tree.findTree(tree.rootNode,value))
            {
                System.out.print("Value has been found: " + value);
            }else System.out.print("Not Found");
        }
    }



