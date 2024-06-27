public class finaldemo {
    static void procA()
    {
        try{
            System.out.println("Inside procA");
            throw new NullPointerException("Nulla exception caught");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
       
        finally{
            System.out.println("Inside procA finally block");
        }
         System.out.println("Inside procA but outside try and finally");
    }
    static void procB()
    {
        try
        {
            System.out.println("Inside procB");
            return;
        }
        catch(Exception e)
        {
            
        }
        finally{
            System.out.println("Inside finally block of procB executed before return statement of procB");
        }
        System.out.println("Inside procB but outside try and finally");
    }
    static void procC()
    {
        try{
            System.out.println("Inside procC");
        }
        finally{
            System.out.println("procC finally");
        }

    }
    public static void main(String args[])
    {
try{
    procA();
    procB();
    procC();
}
catch(Exception e)
{

}
    }
    
}
