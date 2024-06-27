import java.util.*;
public class problems {
    
    static void pushToBottom(Stack<Integer> s,int data)
    { 
        if(s.isEmpty())
        {
       s.push(data);
       return ;
        }
      int n = s.pop();
      pushToBottom(s,data);
      s.push(n); 
    }
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        pushToBottom(stack,6);
       System.out.println(stack);
    }
    
}
