
class linkedList
{
    static node head;
    static node tail;
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int val)
    {
        node newnode = new node(val);
        if(head==null||tail==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    void show()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    void divider(node head)
    {  if(head.next==null)
        return;
        node slow = head;
        node fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        } 
        node head2 = slow.next;
        slow.next=null;
        divider(head);
        divider(head2);
        merge(head,head2);
    }
    void merge(node head1,node head2)
    {
        node ptr1=head1,ptr2=head2;
        while(ptr1!=null&&ptr2!=null)
        {   node next;
            if(ptr1.data<ptr2.data)
            {   next=ptr1.next;
                ptr1.next=ptr2;
                ptr1=next;
            }
            else{
                next=ptr2.next;
                ptr2.next=ptr1;
                ptr2=next;
            }
        }
        while(ptr1!=null)
    }

}

public class mergesortonLL {
    
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.show();
    }
    
}
