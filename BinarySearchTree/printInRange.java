import java.util.*;
public class printInRange {
   public static  class Node
    {
      int data;
      Node left;
      Node right;
      Node(int data)
      {
        this.data=data;
        this.left=null;
        this.right=null;
      }
    }
    public static Node insert(Node root, int val)
    {
        if(root==null)
        return new Node(val);
        
        else if(root.data<val)
        root.right=insert(root.right,val);
        else 
        root.left=insert(root.left,val);
        return root;
    }
    public static void levelOrderTraversal(Node root)
    {
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      queue.add(null);
      while(!queue.isEmpty())
      {
        Node curr = queue.remove();
        if(curr==null)
        {
            if(queue.isEmpty())
            break;
            System.out.println();
            queue.add(null);
        }
        else{
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            queue.add(curr.left);
            if(curr.right!=null)
            queue.add(curr.right);
        }
      }
    }
    public static void printinRange(Node root,int low,int high)
    {
       if(root==null)
       return;
       if(root.data>=low&&root.data<=high)
       {
        
        printinRange(root.left,low,high);
        System.out.print(root.data+" ");
        printinRange(root.right,low,high);
       }

       else if(root.data<low)
       printinRange(root.right,low,high);
       else 
       printinRange(root.left,low,high);
    }
    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        System.out.print(path.get(i)+"->");
        System.out.println("Null");
    }
    public static void root2leafpath(Node root,ArrayList<Integer> path)
    {
        if(root == null)
        return;
        path.add(root.data);
        if(root.left==null&root.right==null)
        {
            printPath(path);
        }
        root2leafpath(root.left,path);
        root2leafpath(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String args[])
    {
       int arr[] = { 5,2,6,7,1,4};
       Node root=null;
       for(int i=0;i<arr.length;i++)
       root=insert(root,arr[i]);
       levelOrderTraversal(root);
       System.out.println("\nNumber in range : ");
       printinRange(root,2,7);
       System.out.println("\nPaths root to leaf");
       root2leafpath(root,new ArrayList<>());

    }
}
