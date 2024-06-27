import java.util.Scanner;
  
public class Stack_usingLinkedList {
  public static node top ;
   class node
  {
   node next;
   int data;
    node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }
  void push(int data)
  {
    node newnode = new node(data);
    if(top==null)
    {
      top=newnode;
      return;
    }
    newnode.next=top;
    top=newnode;
  }
  int  pop()
  {
    if(top==null)
    {
      System.out.println("Stack is underflow");
      return -1;
    }
    int pop=top.data;
    top=top.next;
    System.out.println("After pop operation : ");
    show();
    return pop;
  }
  int peek()
  {
    if(top==null)
    {
      System.out.println("Stack is underflow");
      return -1;
    }
    return top.data;
  }
   void show()
  {
    if(top==null)
    {
       System.out.println("Stack is underflow");
      return ;
    }
    node ptr = top;
    while(ptr!=null)
    {
   System.out.println("| "+ptr.data+" |");
   System.out.println("-----");
   ptr=ptr.next;
    }
  }
  void reverse_stack()
  {
    if(top==null||top.next==null)
    {show();
    return ;
    }
    node prev=null;
    node curr = top;
    node next;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    top=prev;
    System.out.println("Stack after reversing : ");
    show();

  }
  
  
    public static void main(String args[])
  {
    Stack_usingLinkedList stack = new Stack_usingLinkedList();
     Scanner sc = new Scanner(System.in);
    while(true)
    {   
     
      System.out.println("1.To push");
      System.out.println("2.To pop");
      System.out.println("3.To peek");
      System.out.println("4.To reverse");
      System.out.println("5.To show");
      System.out.println("6.To exit");
      System.out.println("Enter your choice : ");
      int n = sc.nextInt();
      switch(n)
      {
        case 1:
        System.out.print("Enter data : ");
        stack.push(sc.nextInt());
        break;
        case 2:
        int pop=stack.pop();
        System.out.println("Element popped : "+pop);
        break;
        case 3:
        System.out.println("Element peeked : "+stack.peek());
        break;
        case 4:
        stack.reverse_stack();
        break;
        case 5:
        System.out.println("Stack : ");
        stack.show();
        break;
        case 6:
        System.exit(0);
        break;
        default:
        System.out.println("Invalid choice");
        break;



      }


    }
    
    
    


 
  }
}
