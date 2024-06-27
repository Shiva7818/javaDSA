

// public class knapsack {
//     static int knapsack(int []wt,int []val,int w,int n)
//     {
//         if(w==0||n==0)
//         return 0;
//         if(wt[n-1]<=w)
//         {
//        int ans = val[n-1]+knapsack(wt,val,w-wt[n-1],n-1);
//        int ans2 = knapsack(wt,val,w,n-1);
//        return Math.max(ans,ans2); 
//         }
//         else
//         return knapsack(wt,val,w,n-1);
//     }
//     public static void main(String args[])
//     {
//         int wt[] = {32,45,39,56,12};
//         int val[] = {10,30,29,40,30};
//         int w=100;
//         System.out.println("MAximum value : "+knapsack(wt,val,w,wt.length));
//     }
    
// }


public class knapsack
{
    static int knapsack1(int []wt,int val[],int w,int n,int dp[][])
    {
        if(w==0||n==0)
        return 0;
        if(dp[n][w]!=-1)
        return dp[n][w];
        if(wt[n-1]<=w)
        {
            int ans1 = val[n-1]+knapsack1(wt,val,w-wt[n-1],n-1,dp);
            int ans2 = knapsack1(wt,val,w,n-1,dp);
            dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];
        }

        else{
            dp[n][w] = knapsack1(wt,val,w,n-1,dp); 
            return dp[n][w];
        }
    }
    static int knapTab(int []wt,int val[],int w ,int n,int dp[][])
    {
   for(int i=0;i<dp.length;i++)
    dp[i][0]=0;
    
   
    }
    public static void main(String args[])
        {
            int wt[] = {2,5,1,3,4};
            int val[] = {15,14,10,45,30};
            int w=7;
            int dp[][] = new int [val.length+1][w+1];
            // for(int i=0;i<dp.length;i++)
            // {
            //     for(int j=0;j<dp[0].length;j++)
            //     dp[i][j]=-1;
            // }
            System.out.println("MAximum value : "+knapsack1(wt,val,w,wt.length,dp));
            System.out.println("Maximum value : "+knapTab(wt,val,w,wt.length,dp));
        }
}