import java.util.*;
public class binaryTree {
    static class node
    {
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
    public static class BinaryTree{
        static int ind=-1;
        public static node buildTree(int nodes[])
        {   ind++;
            if(nodes[ind]==-1)
            return null;
            node newnode = new node(nodes[ind]);
            newnode.left= buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }
        public static void preOrder(node root)
        {
            if(root==null)
            return ;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
         public static void inOrder(node root)
        {
            if(root==null)
            return ;
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
        
        public static void postOrder(node root)
        {
            if(root==null)
            return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrderTraversal(node root)
        {
            if(root==null)
            return;
            Queue<node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty())
            {
                node temp = queue.remove();
                if(temp==null)
                {     
                    System.out.println();
                      if(queue.isEmpty())
                      break;
                      queue.add(null);
                }
                else 
                {
                    System.out.print(temp.data+" ");
                     
                    if(temp.left!=null)
                    queue.add(temp.left);
                    if(temp.right!=null)
                    queue.add(temp.right);
                    
                }
            }
        }


    }
    public static void main(String args[])
    { 
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,6,-1,7,-1,-1};
//   int nodes[] = {2,4,-1,-1,5,-1,-1};
    
 BinaryTree tree = new BinaryTree();
    node root =  tree.buildTree(nodes);
    System.out.println("Preorder traversal");
    tree.preOrder(root);
    System.out.println("\nInorder traversal");
    tree.inOrder(root);
    System.out.println("\nPostorder traversal");
    tree.postOrder(root);
    System.out.println("\nLevel order traversal : ");
    tree.levelOrderTraversal(root);
    

    }
}
