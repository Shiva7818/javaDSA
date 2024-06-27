public class subtree {
    public static class node{
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
        static int idx = -1;
        public node BuildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            return null;
            node newnode = new node(nodes[idx]);
            newnode.left=BuildTree(nodes);
            newnode.right=BuildTree(nodes);
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
    }
    public static boolean isSubtree(node root,node subroot)
        { if(root==null)
            return false;
           if(root.data==subroot.data)
           {
              if(isIdentical(root,subroot))
              return true;
           }
           return isSubtree(root.left,subroot)||isSubtree(root.right,subroot);

        }
        public static boolean isIdentical(node root,node subroot)
        {
          if(root==null&&subroot==null)
          return true;
          if(root==null||subroot==null||root.data!=subroot.data)
          return false;
          if(!isIdentical(root.left,subroot.left))
          return false;
          if(!isIdentical(root.right,subroot.right))
          return false;
          return true;
        }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        node root = tree.BuildTree(nodes);
        System.out.println("Preorder traversal");
         tree.preOrder(root);
        // int nodesub[] = {2,4,-1,-1,5,-1,-1};
        // BinaryTree subtree = new BinaryTree();
        // node subroot = subtree.BuildTree(nodesub);
        // System.out.println("\nPreorder traversal");
        // subtree.preOrder(subroot);
        node subroot = new node(2);
        subroot.left = new node(4);
        subroot.right = new node (6);
        
        System.out.println("\nIs subtree a subtree of tree : "+isSubtree(root,subroot));


    }
}
