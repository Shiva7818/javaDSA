
class mythread extends Thread 
{
public void run() throws ArithmeticException
{    int i=0;
    // int a=2;
    // int b=a/i;
    while(i<40)
    {
        System.out.println("Mythread1 "+i);
        i++;
    
    }
    
}
}
class mythread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<40)
        {
            System.out.println("Mythread2 is running "+i);
            i++; 
        }
    }
}
public class threads {
    public static void main(String[] args) {
        try
        {
            mythread ob1 = new mythread();
        mythread2 ob2 = new mythread2();
        ob1.start();
        ob2.run();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured"+e);
        }
    }
}
