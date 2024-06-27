import java.util.*;
public class kthlevel {
    static int idx = -1;
    class node
    {
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    node insert(int []nodes)
    {
     idx++;
     if(nodes[idx]==-1)
     return null;
     node newnode = new node(nodes[idx]);
     newnode.left=insert(nodes);
     newnode.right=insert(nodes);
     return newnode;
    }
    void preorder(node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void levelOrderTraversal(node root)
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
    void kthlevelOrder(node root,int k)
    {
        Queue<node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count=1;
        while(!queue.isEmpty())
        {
            node temp = queue.remove();
            if(temp==null)
            {
                if(queue.isEmpty())
                break;
                count++;
                queue.add(null);
            }
            else
            {
              if(count==k)
              {
                System.out.print(temp.data+" ");
              }
              if(temp.left!=null)
              queue.add(temp.left);
              if(temp.right!=null)
              queue.add(temp.right);
            }
        }
    }
    void kthlevelOrder(node root,int k,int count)
    {
        if(root==null)
        return;
        if(count == k)
        {   
            System.out.print(root.data+" ");
            return;
        }
        if(root==null)
        return;
        kthlevelOrder(root.left,k,count+1);
        kthlevelOrder(root.right,k,count+1);

    }
    {
        
    }
    public static void main(String args[])
    {
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,6,-1,7,-1,-1};
        kthlevel tree = new kthlevel();
        node root = tree.insert(nodes);
        tree.preorder(root);
        System.out.println("Level order traversal");
        tree.levelOrderTraversal(root);
        System.out.println("Kth level");
        // tree.kthlevelOrder(root,3);
        tree.kthlevelOrder(root,3,1);
    }
    
}
