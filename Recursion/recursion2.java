public class recursion2 {
    public static boolean isSorted(int []arr,int i)
    {
        if(i==arr.length-1)
        return true;
        if(arr[i]>arr[i+1])
        return false;
        return isSorted(arr,i+1);
    }
    public static int firstoccur(int arr[],int key,int i)
    {
        if(i==arr.length)
        return -1;
        if(arr[i]==key)
        return i;
        return firstoccur(arr,key,i+1);

    }public static int lastoccur(int arr[],int key,int i)
    {
        if(i==arr.length)
            return -1;

        // int isfound = lastoccur(arr,key,i+1);
        // if(isfound1&&arr[i]==key)
        // return i;
        // return isfound;


        if(lastoccur(arr,key,i+1)==-1&&arr[i]==key)
        return i;
        return lastoccur(arr,key,i+1);
    }
 public static int pow(int x,int n)
 {
    if(n==0)
    return 1;
    return x*pow(x,n-1);
 }
 public static int optimize_pow(int x,int n)
 {
    if(n==0)
    return 1;
    if(n%2==0)
    return optimize_pow(x,n/2)*optimize_pow(x,n/2);
    else 
    return x*optimize_pow(x,n/2)*optimize_pow(x,n/2);
    
 }
    public static void main(String args[])
    {
    // int arr[] = {1,2,9,4,5};
    // System.out.println("Is array sorted : "+isSorted(arr,0));
    // int brr[]={23,45,32,12,7,9,9,0};
    // System.out.println("First occurence of element at : "+firstoccur(brr,9,0));
    // System.out.println("Last occurence of element at : "+lastoccur(brr,9,0));


    System.out.println("Power of x raised to n = "+pow(5,2));
    System.out.println("Power of x raised to n = "+optimize_pow(5,4));
    // for(int i=0;i<5;i++)
    // int count=0;
    
    }
    
}
