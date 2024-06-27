public class bit {
    public static void evenodd(int n)
    {
        if((n&1)==0)
        System.out.println(n+" is even");
        else
        System.out.println(n+" is odd");
    }
    public static void get_ith(int n,int i) 
    {
    int num = 1<<i;
    num=n&num;
    num= num>>i;
    System.out.println("i th bit of "+n+" is "+num);
    }
    public static int set_ith(int n,int i)
    {
      int bitmask=1<<i;
      return n|bitmask;
    }
    public static int clear_ith(int n,int i)
    {
     int bitmask = ~(1<<i);
     return n&bitmask;
    }
    public static void main(String args[])
    {
        // one complement
        int a=10;
        System.out.println(~a);
        System.out.println(a<<2);
        System.out.println(a>>2);
        // Check even/odd
        evenodd(30);
        evenodd(345);
        evenodd(23);
        // get ith bit
        get_ith(7,2);
        System.out.println("Number after seting ith bit "+set_ith(4,1));
        System.out.println("Number after clearing ith bit "+set_ith(7,1));
    
    }
    
}
