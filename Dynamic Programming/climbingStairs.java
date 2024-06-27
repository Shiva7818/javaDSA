import java.util.*;
public class climbingStairs {
    static int ways(int n)
    {
        if(n==0) 
        return 1;
       if(n<0)
       return 0;
    // if(n==1||n==2)
    // return n;


       return ways(n-1)+ways(n-2);
    }
    static int ways2(int []dp,int n)
    {
       if(n==0)
       return 1;
       if(n<0)
       return 0;
       if(dp[n]!=-1)
       return dp[n];
       dp[n] = ways2(dp,n-1)+ways2(dp,n-2);
       return dp[n];
    }
    // if 1 ,2 and 3 stair jump allows
    static int ways3(int []dp,int n)
    {
     if(n==0)
     return 1;
     if(n<0)
     return 0;
     if(dp[n]!=-1)
     return dp[n];
     dp[n] = ways3(dp,n-1)+ways3(dp,n-2)+ways3(dp,n-3);
     return dp[n];
    }
    public static void main(String args[])
    {
    //  System.out.println(ways(0));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of stairs :");
    int n= sc.nextInt();
    int dp[] = new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
 dp[i] = dp[i-1]+dp[i-2];
    }
    System.out.println(dp[n]);
    // Arrays.fill(dp,-1);

    // Tabulation

    // System.out.println(ways2(dp,n));
    
    // System.out.println(ways3(dp,n));

    sc.close();
    
    }
    
    
}
