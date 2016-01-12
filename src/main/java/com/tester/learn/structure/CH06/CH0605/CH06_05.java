package com.tester.learn.structure.CH06.CH0605;
import java.io.*;
/**
 * Created by U0138272 on 1/2/2016.
 */

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

class BinaryTree {
    public TreeNode rootNode;

    public void Add_Node_To_Tree(int value)
    {
            if (rootNode == null)
            {
                rootNode = new TreeNode(value);
                return;
            }

            TreeNode currentNode = rootNode;
            while(true)
            {
                if (value < currentNode.value)
                {
                    if(currentNode.left_Node == null)
                    {
                        currentNode.left_Node = new TreeNode(value);
                        return;
                    }else currentNode = currentNode.left_Node;

                }else
                {
                    if(currentNode.right_Node == null)
                    {
                        currentNode.right_Node = new TreeNode(value);
                        return;

                    }else currentNode = currentNode.right_Node;
                }
        }

    }


    public void InOrder(TreeNode node)
    {
        if(node !=null)
        {
            InOrder(node.left_Node);
            System.out.print("[" + node.value+ "]");
            InOrder(node.right_Node);
        }
    }

    public void PreOrder(TreeNode node)
    {
        System.out.print("[" + node.value + "]");
        PreOrder(node.left_Node);
        PreOrder(node.right_Node);
    }

    public void PostOrder(TreeNode node)
    {
        if(node != null)
        {
            PostOrder(node.left_Node);
            PostOrder(node.right_Node);
            System.out.print("[" + node.value + "]");

        }
    }


}




public class CH06_05 {

  public static void main(String args[]) throws IOException
  {
      int value;
      BinaryTree tree = new BinaryTree();
      BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Pls input data, end with -1:   \n" );
      while(true)
      {
          value = Integer.parseInt(keyin.readLine());
          if(value == -1) break;
          tree.Add_Node_To_Tree(value);
      }

      System.out.print("================  \n");
      System.out.print("the resluts is done \n");
      tree.InOrder(tree.rootNode);


  }


}