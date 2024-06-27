import java.util.*;
public class lowestCommonAncestor {
   
   
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
    static class binaryTree
    {   
        List<Node> listp = new ArrayList<>();
        List<Node> listq = new ArrayList<>();
        void helper(Node root,Node temp,List<Node> list)
        {
            if(root==null)
            return;
            list.add(root);
            if(root.data==temp.data)
            {  if(listp.isEmpty())
                listp.addAll(new ArrayList<>(list));
                else
                listq.addAll(new ArrayList<>(list));
                return;
            }
            
            helper(root.left,temp,list);
            helper(root.right,temp,list);
            list.remove(list.size()-1);
            
        }
        static int idx = -1;
        static Node insert(int arr[])
        {   
            
            idx++;
            if(arr[idx]==-1)
            return null;
            Node newnode = new Node(arr[idx]);
            newnode.left=insert(arr);
            newnode.right=insert(arr);
            return newnode; 

        }
        public static void levelOrderTraversal(Node root)
        {
            if(root==null)
            return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty())
            {
                Node temp = queue.remove();
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
        public Node lowestcommonAncestor(Node root, Node p, Node q) {
        
            helper(root,p,new ArrayList<>());
            helper(root,q,new ArrayList<>());
            Node lca=null;
            int size = listp.size()<listq.size()?listp.size():listq.size();
            for(int i=0;i<size;i++)
            {
                if(listp.get(i).data==listq.get(i).data)
                lca = listp.get(i);
            }
            return lca;
    
        }

    }
    public static void main(String args[])
    {
    int nodes[] ={1,2,3,-1,-1,4,-1,-1,6,-1,7,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.insert(nodes);
    tree.levelOrderTraversal(root);
    System.out.println("lowest Common Ancestor ("+root.left.left.data+","+root.right.right.data+") : "+tree.lowestcommonAncestor(root,root.left.left,root.right.right).data);

    }
}
