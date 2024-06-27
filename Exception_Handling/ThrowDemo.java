public class ThrowDemo {
    public static void demoproc() throws Exception
    {
        try{
            throw new Exception();
            
        }
        
        // catch(NullPointerException e)
        // {
        //     System.out.println("Caught inside demoproc");
        //     throw e;
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        finally
        {
            
        }
    }
    public static void main(String args[])throws Exception
    {
      try{
      demoproc();
      }
      catch(NullPointerException e)
      {
               System.out.println("Recaught");
      }
    }
}
