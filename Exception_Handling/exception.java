// import java.util.Random;
import java.util.*;
public class exception {
    public static void nestTry(int a)
    { try{
      if(a==1)
      {
        int d=3;
        d=d/(a-1);
      }
    else{
      int arr[] = {3};
      arr[2]=4;
      }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
    }
    public static void main(String args[])
    {
    //    int a=0,b=0,c=0;
    //    Random r = new Random();
    //    for(int i=0;i<100000;i++)
    //    {
    //     try{
    //         a=r.nextInt();
    //         b=r.nextInt();
    //         c=a/b;

    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("Exception "+e);
    //     }
    //    }
    //    System.out.println("a = "+a);
   
    
       
       
       
    //     try{
    //         int a=args.length;
    //         int b=23/a;
    //         int arr[] = {1};
    //         arr[30]=2;
    //         // System.out.println(a/0);   

    //     }
    //     catch(ArrayIndexOutOfBoundsException e)
    //     {
    //         System.out.println(e);
    //     }
    //     catch(ArithmeticException e)
    //     {
    //       System.out.println(e);
    //     }

    //     catch(Throwable e)
    //     {
    //         System.out.println("Exception in Throwable catch occurs");
    //     }



    /*Nested try statements */
    // try{
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a value");
    //     int a= sc.nextInt();
    //     int d=2;
    //     d= d/a;
        
    //     try
    //     {
    //         a=a-1;
    //         d=d/a;
    
    //         int arr[] = {1};
    //         arr[2]=23;
    //     }
    //     finally{

    //     }
    //    sc.close();
    
    //     }
    
    //     catch(ArithmeticException e)
    //     {
    //         System.out.println(e);
    //     }
    //     catch(ArrayIndexOutOfBoundsException e)
    //     {
    //       System.out.println(e);
    //     }
    
    
// Nested try statement via method call
try
{
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        int d=0;
        d=d/a;
        nestTry(a);
}
catch(ArithmeticException e){
    System.out.println(e);
}

}  
}
