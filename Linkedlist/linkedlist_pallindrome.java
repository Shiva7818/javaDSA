class linkedlist
{
     public static node head;
  public static node tail;
  public static int size=0;

  class node
  {
    int data;
    node next;
    public node(int data)
    {
        this.data=data;
        this.next=null;
    }
  }
  public void addfirst(int data)
  {  size++;
    node newnode = new node(data);
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
  }
  public void show()
  {
    node ptr = head;
    while(ptr!=null)
    {
        System.out.print(ptr.data+"->");
        ptr=ptr.next;
    }
    System.out.print("null");
    System.out.println();
}
public  node findmid(node head)  
{
  node ptr =head;
  node ptr1 = head;
  while(ptr1!=null&&ptr1.next!=null)
  {
    ptr=ptr.next;
    ptr1=ptr1.next.next;
  }
  node pt = null;
  
  return ptr;
}
public boolean check_pallindrom()
{
    if(head==null || head.next==null)
    {
         return true;
    }
 node midnode = findmid(head);
  node pre = null;
  node curr = midnode;
  node next;
  while(curr!=null)
  {
    next = curr.next;
    curr.next = pre;
    pre = curr;
    curr=next;
  }
  node left =head;
  node right = pre;
  while(right!=null)
  {
    if(right.data!=left.data)
    {
        return false;
    }
    left=left.next;
    right=right.next;
  }
  return true;

}
}
public class linkedlist_pallindrome {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        
        ll.show();
        if(ll.check_pallindrom())
        System.out.println("Linked List is pallindrom");
        
        else
        System.out.println("Linked List is not pallindrom");
        

    }
}
