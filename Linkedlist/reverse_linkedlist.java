import java.util.*;
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
public void reverse_LL()
{
    node prev = null;
    node curr = tail = head;
    node next;
    while(curr!=null)
    {
      next = curr.next;
      curr.next=prev;
      prev= curr;
      curr=next;

    }
    head=prev;
}
public void removefromend(int k)
{  if(head==null)
    {
        System.out.println("Linkedlist is empty");
        return;
    }
   if(k==size)
   {
    head=head.next;
    size--;
    return;
   }
   int ind= size-k+1;
   int count=1;
   node ptr=head,ptr1=head.next;
   while(count!=ind-1)
   {
    ptr=ptr.next;
    ptr1=ptr1.next;
    count++;
   }
   ptr.next=ptr1.next;



}
}



public class reverse_linkedlist {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    linkedlist ll = new linkedlist();
    ll.addfirst(5);
    ll.addfirst(4);
    ll.addfirst(3);
    ll.addfirst(2);
    ll.addfirst(1);
    ll.show();
    ll.reverse_LL();
    ll.show();
    int n;
    System.out.println("Enter value of n to remove nth node from end : ");
    n=sc.nextInt();
    ll.removefromend(n);
    ll.show();
   sc.close();
    } 
    
}
