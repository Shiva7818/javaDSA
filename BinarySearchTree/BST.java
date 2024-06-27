import java.util.*;
public class BST {
    static class Node 
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
   public  static  Node insert(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
            
        }
        else if(root.data>val)
        {
            root.left =  insert(root.left,val);
        }
        else
        {
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static Node deleteNode(Node root,int val)
    {
        if(root.data<val)
        {
            root.right = deleteNode(root.right,val);
        }
       else if(root.data>val)
        {
            root.left = deleteNode(root.left,val);
        }
        else
        {
            if(root.left==null&&root.right==null)
            return null;

            if(root.left==null)
            return root.right;
            else if(root.right == null)
            return root.left;

            Node is = findInorderSucessor(root.right);
            root.data=is.data;
            root.right = deleteNode(root.right,is.data);
        }
      return root;

    }
    public static Node findInorderSucessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    static  void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void levelOrder(Node root)
    {
         Queue<Node> queue = new LinkedList<>();
         queue.add(root);
         queue.add(null);
         while(!queue.isEmpty())
         {
            Node temp = queue.remove();
            if(temp==null)
            {   System.out.println();
                if(queue.isEmpty())
                break;

                queue.add(null);
            }
            else{
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                queue.add(temp.left);
                if(temp.right!=null)
                queue.add(temp.right);

            }
         }

    }
    static boolean search(Node root,int key)
    {
        if(root==null)
        return false;
        if(root.data == key)
        return true;
        else if(root.data>key)
        return search(root.left,key);
        else
        return search(root.right,key);
        
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,4,3,5};
        Node root = null;
        for(int i=0;i<arr.length;i++)
        {
            root = insert(root, arr[i]);
        }
        inorder(root);
        System.out.println("Level order Traversal");
        levelOrder(root);
        Scanner sc = new Scanner(System.in);
        int n;
        // System.out.println("Enter a key");
        // n = sc.nextInt();
        // System.out.println("BST contains "+n+" ? "+search(root,n));
        // sc.close();
        deleteNode(root,5);
        System.out.println("Level order Traversal after deletion");
        levelOrder(root);

    }
}
