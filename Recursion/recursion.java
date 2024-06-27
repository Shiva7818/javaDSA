public class recursion {
    public static void printnum(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printnum(n-1);
    }
    public static void printinc(int n)
    {   if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
         printinc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n)
    {
        if(n==0)
        return 1;
        return n*fact(n-1);

    }
    public static int sumnat(int n)
    {
        if(n==1)
        return 1;
        return n+sumnat(n-1);
    }
    public static int fibb(int n)
    {
        if(n==0||n==1)
        return n;
        return fibb(n-1)+fibb(n-2);
    }
     
    public static void main(String args[])
    {
    printnum(10);
    printinc(10);
    System.out.println("\n5! = "+fact(5));
    System.out.println("Sum of first 5 Natural numbers = "+sumnat(5));
    System.out.println("Fibbonacci "+fibb(5));
    System.out.println("Fibbonacci "+fibb(6));
    System.out.println("Fibbonacci "+fibb(7));
    }
}
