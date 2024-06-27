class LinkedList{ 
    public static node head=null;
    public static node tail=null;
    static int size=0;
      class node
    {
        int data;
        node next;
        public node(int data)
        {
            this.data = data;
            this.next = null;

        }
    }

    public void reverseBetween(int left, int right) {
      
       int count=1;
       node lhead=head,prev1=head;
      while(count!=left)
      {   
          prev1=lhead;
          lhead=lhead.next;
          count++;
      }
      node rtail=lhead;
      while(count!=right)
      {
          rtail=rtail.next;
          count++;
      }

     
        // if(lhead==rtail||((head==lhead)&&(head==rtail)))
        // return head;
        
        
        node prev = rtail.next;
        node  curr = lhead;
        node next;
        while(prev!=rtail)
        {
            next = curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        System.out.println(rtail.next.data);
        prev1.next=prev;
        // return head;
        
    }
    
   public void addfirst(int data)
   {
    // O(1)
    size++;
    node newnode = new node(data);
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    
    newnode.next = head;
    head = newnode;

   }
   public void addlast(int data)
   {
    // O(1)
    size++;
    node newnode = new node(data);
    
    if(head==null)
    {
        head =tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;

   }
   
   public void addbet(int index, int data)
  { size++;
    node newnode = new node(data);
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    node temp=head;
    int tem=0;
    while(tem!=index-1)
   {
    temp=temp.next;
    ++tem;
   }
   newnode.next=temp.next;
   temp.next = newnode;
   
  }

  public void removefirst()
  {
    if(head == null)
    {
        System.out.println("Linkedlist is empty");
        return;
    }
    else if(size==1)
    {
        head=tail=null;
        size--;

    }
    head=head.next;
    size--;
    return;
  }
  public void removelast()
  {
    if(size==0)
    {
        System.out.println("LinkedList is empty");
        return;
    }
    else if(size==1)
    {
        head=tail=null;
        size--;
        return;
    }
    node ptr =head;
    // int ind=1;
    // while(ind!=size-1)
    // {
    //     ptr=ptr.next;
    //     ind++;
    // }
    while(ptr.next.next!=null)
    {
        ptr=ptr.next;
    }
    ptr.next=null;
    tail=ptr;
    size--;
  }


   public void show()
   { 
    if(head==null)
  {  System.out.println("LL is empty");
return;}
    node ptr = head;
    while(ptr!=null)
    { 
        System.out.print(ptr.data+"->");
        ptr = ptr.next;
    }
    System.out.print(tail.next);
    System.out.println();
   }
  public int helper(node head,int key)
  {
      if(head==null)
      return -1;
      else if(head.data==key)
      return 0;
      int indx=helper(head.next,key);
      if(indx==-1)
      {
        return -1;
      }
      return indx+1;

  }
   public int recsearch(int key)
   {
    return helper(head,key);
   }
    
 public void size ()
 {
    System.out.println("Size of linkedlist = "+size);
 }
}


public class linked {
    
 
    public static void main(String args[])
    {
      LinkedList ll = new LinkedList();
      ll.show();
      ll.addfirst(1);
      ll.show();
      ll.addfirst(2);
      ll.show();
      ll.addfirst(0);
      ll.show();
      ll.addlast(3);
      ll.show();
      ll.addbet(3,5);
      ll.show();
      ll.addlast(6);
      ll.addlast(7);
      ll.show();
      // ll.removefirst();
      // ll.show();
      // ll.size();
      // ll.removelast();
      // ll.show();
      ll.size();
      // System.out.println("Searched element at index "+ll.recsearch(9));
      System.out.println("After Swaping nodes");
      ll.reverseBetween(2,6);
      ll.show();
    }
    
}
 