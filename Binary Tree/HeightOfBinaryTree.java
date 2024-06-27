import java.util.*;

public class HeightOfBinaryTree {
   public  static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree
    {
       static int idx=-1;
       public static node BuildTree(int nodes[])
       {
        idx++;
        if(nodes[idx]==-1)
        return null;
        node newnode = new node(nodes[idx]);
        newnode.left = BuildTree(nodes);
        newnode.right = BuildTree(nodes);
        return newnode;

       }
       public static int heightOfTree(node root)
       {
        if(root==null)
        return 0;
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        return Math.max(lh,rh)+1;

       }
       public static int countNodes(node root)
       {
        if(root==null)
        return 0;
        int lcount=countNodes(root.left);
        int rcount = countNodes(root.right);
        return lcount+rcount+1;
       }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,-1,3,-1,5,-1,-1};
    
 BinaryTree tree = new BinaryTree();
    node root =  tree.BuildTree(nodes);
    System.out.print("Height of Binary Tree : "+tree.heightOfTree(root));
    System.out.print("\nNumber of nodes in binary tree : "+tree.countNodes(root));
    }
}
