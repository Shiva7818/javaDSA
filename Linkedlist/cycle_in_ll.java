class linkedlist{
    public static node head;
    public static node tail;
    public class node{
        int data;
        node next;
          public node(int data )
          {
              this.data=data;
              this.next=null;

          }
    }
    void addfirst(int data)
    {
     node newnode = new node(data);
     if(head==null)
     {
        head=tail=newnode;
        return;     }
     newnode.next = head;
     head=newnode;
     
    }
    void addlast(int data)
    {
        node newnode = new node(data);
        if(tail==null)
        {head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        tail.next=head;

        
    }
    void show()
    {
        node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
            }
                       System.out.print("null");
                       System.out.println("");

    }
    public boolean isCycle()
    {
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null)
        {  
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public void removeCycle()
    {
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null)
        {  
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        slow=head;
        node prev=null;
        while(slow!=fast)
        {   prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        prev.next=null;

    
    }
    }

public class cycle_in_ll {
    public static void main(String args[])
    {
     linkedlist ll = new linkedlist();
     
     ll.addlast(2);
     ll.addlast(3);
     ll.addlast(4);
     ll.addlast(5);
     ll.addlast(6);
     ll.addlast(7);
     ll.addlast(8);
     ll.addlast(9);
     ll.addlast(10);
     ll.addlast(11);
     ll.addfirst(1);
    //  ll.addfirst(0);


     
    // ll.show();
    if(ll.isCycle())
    {
        System.out.println("There is a cycle in linked list");
        ll.removeCycle();
        System.out.println("Linkedlist after removing the cycle ");
        ll.show();    

}
    else 
    System.out.println("There is no cycle in linked list");



    }
}
