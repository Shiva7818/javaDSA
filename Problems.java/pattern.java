import java.util.*;
public class pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if((i-2)%4==0||(i-4)%4==0)
            System.out.print(" ");
            else if((i-3)%4==0)
            System.out.print("  ");
            System.out.println("*");

        }
        sc.close();
    }
    
}
