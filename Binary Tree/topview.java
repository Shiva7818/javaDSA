import java.util.*;
public class topview {
    static class node{
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
    static class binaryTree{
        static int ind = -1;

    public static node buildTree(int arr[])
      {
      ind++;
      if(arr[ind]==-1)
      return null;
      node newnode = new node(arr[ind]);
      newnode.left = buildTree(arr);
      newnode.right = buildTree(arr);
      return newnode;

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
    
    static class info
    {
        node node;
        int hd;
        public info(node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topview1(node root)
    {
        Queue<info> queue = new LinkedList<>();  
        HashMap<Integer,node> map = new HashMap<>();
        int min=0,max=0;
        queue.add(new info(root,0));
        queue.add(null);
        while(!queue.isEmpty())
        {
            info curr = queue.remove();
            if(curr==null)
            {
                if(queue.isEmpty())
                break;
                
            queue.add(null);
                
            }
            else{
                if(!map.containsKey(curr.hd))
                   map.put(curr.hd,curr.node);
                   if(curr.node.left!=null)
                   {
                    queue.add(new info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                   }
                   if(curr.node.right!=null)
                   {
                    queue.add(new info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                   }

                
            }
        }
       for(int i=min;i<=max;i++)
       {
        System.out.print(map.get(i).data+" ");
       }
       System.out.println();

    }
    public static void main(String args[])
    {
        // int arr[] = {1,2,3,-1,-1,4,-1,-1,6,-1,7,-1,-1};
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        node root = tree.buildTree(arr);
        tree.levelOrderTraversal(root);
        System.out.println("Topview of binary tree : ");
        topview1(root);
    }
}
