// package except;

class myException extends Exception
{   
    private int a;
    myException(int a)
    {
      this.a=a;
    }
    public String toString()
    {
        return "MyException []";
    }
}
public class exceptionSubclass {
    static void compute(int a)throws myException
    {   System.out.println("Called compute "+a);
        if(a>10)
        throw new myException(a);
        System.out.println("Exit normally");

    }
    public static void main(String args[])
    {
try{
    int a=2;
    String z=Integer.toString(a);
    System.out.println(z);
    compute(1);
    compute(11);
   
}
catch(myException e)
{
System.out.println(e);
}
    }
    
}
