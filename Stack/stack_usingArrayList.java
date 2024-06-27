import java.util.ArrayList;
public class stack_usingArrayList {
    static class Stack 
    {
        static ArrayList<Integer> stack = new ArrayList<>();
        public static boolean isEmpty()
        {
            return stack.size()==0;
        }
        public static void push(int data)
        {
            stack.add(data);

        }
        public static int pop()
        {   
            if(stack.size()==0)
            {
                System.out.println("Stack is underflow");
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }
        public static int peek()
        {   if(stack.size()==0)
            {
                System.out.println("Stack is underflow");
                return -1;
            }
            return stack.get(stack.size()-1);
        }
    }
    
    public static void main(String args[])
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top of stack : "+stack.pop());
        System.out.println("Top of stack : "+stack.pop());
        System.out.println("Top of stack : "+stack.pop());
        System.out.println("Top of stack : "+stack.peek());
    }
}
