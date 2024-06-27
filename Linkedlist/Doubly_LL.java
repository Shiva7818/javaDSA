class doublyLinkedList
{  public static node head;
    public static node tail;
    static int size=0;
    class node{
        int data;
        node prev;
        node next;
        node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {   size++;
        node newnode = new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return ;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data)
    {   size++;
        node newnode = new node(data);
        if(tail==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    public void show()
    {
        if(head==null)
        {
            System.out.println("Doubly LinkedList is empty");
            return;
        }
        node ptr = head;
        System.out.print("null<-->");
        while(ptr!=null)
        {
            System.out.print(ptr.data+"<-->");
            ptr=ptr.next;
        }
        System.out.println("null");
        System.out.println("Size of linked list : "+size);
    }
    public void reverseShow()
    {
        if(tail==null)
        {
            System.out.println("Doubly LinkedList is empty");
            return;
        }
        node ptr = tail;
        System.out.print("null<-->");
        while(ptr!=null)
        {
           System.out.print(ptr.data+"<-->");
            ptr=ptr.prev;
        }
        System.out.println("null");
        System.out.println("Size of linked list : "+size);
    }
}
public class Doubly_LL {
    public static void main(String args[] )
    {
    doublyLinkedList ll = new doublyLinkedList();
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(6);
    ll.addLast(7);
    ll.show();
    ll.reverseShow();
}
}