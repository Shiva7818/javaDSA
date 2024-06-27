import java.util.Scanner;
public class Fibonacci
{
    static int fib(int n,int []arr)
    {
        if(n==0||n==1)
        return n;
        if(arr[n]!=0)
        return arr[n];
        arr[n] = fib(n-1,arr)+fib(n-2,arr);
        return arr[n];
    }
    static int[] fib1(int dp[],int n)
    {
          for(int i=2;i<=n;i++)
          {
            dp[i]=dp[i-1]+dp[i-2];
          }
          return dp;
    }
    static int fibModified(int t1,int t2,int n,int dp[])
    {
        if(n==0)
        return t1;
        if(n==1)
        return t2;
        if(dp[n]!=0)
        return dp[n];
        dp[n]=fibModified(t1,t2,n-1,dp)*fibModified(t1,t2,n-1,dp)+fibModified(t1,t2,n-2,dp);
        return dp[n];
    }
    public static void main(String args[])
    {
        // int []arr = new int[9];
        // System.out.println("nth term :"+fib(8,arr));
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        // int brr[]=fib1(dp,n);
        // System.out.println("Fibonacci series :");
        // for(int ele : brr)
        // System.out.print(ele+" ");
        
        System.out.println(fibModified(0,1,5, dp));
        sc.close();
        }
        catch(Exception e)
        {
            // System.out.println(e);
            System.out.println("Fibonacci Series :");
            System.out.println("0");

        }
        
        
    }
}