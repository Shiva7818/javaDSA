import java.util.*;
public class BSTInBT {
    static int Size=0;
    static Node bstRoot;
    static class Node
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
    static class Info
    {
        boolean bst;
        int size;
        int min;
        int max;
        Info(boolean bst,int size,int min,int max)
        {
            this.bst=bst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static Info largestBST(Node root)
    {   
        if(root==null)
        return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        if(root.data<=leftInfo.max||root.data>=rightInfo.min)
        return new Info(false,size,min,max);
        if(leftInfo.bst&&rightInfo.bst)
        {   bstRoot = root;
            Size = Math.max(Size,size);
            return new Info(true,Size,min,max);
        }
        return new Info(false,size,min,max);

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
    public static List<List<Integer>> levelOrder2(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty())
        {
            Node temp = queue.remove();
            if(temp==null)
            {   
                ans.add(new ArrayList<>(list));
                list.clear();
                if(queue.isEmpty())
                break;
                queue.add(null);
            }
            else
            {
                list.add(temp.data);
                if(temp.left!=null)
                queue.add(temp.left);
                if(temp.right!=null)
                queue.add(temp.right);
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
    Node root = new Node(50);
    root.left = new Node(30);
    root.left.left = new Node(5);
    root.left.right = new Node(20);

    root.right = new Node(60);
    root.right.left = new Node(45);
    root.right.right = new Node(70);
    root.right.right.left = new Node(65);
    root.right.right.right = new Node(80);
    Info info = largestBST(root);
    System.out.println("Size of largest BST = "+Size);
    System.out.println("Level order ");
    levelOrder(root);
    System.out.print(levelOrder2(root));
    }
    
}
