class MyThread1 implements Runnable
{
    public void run()
    {    int i=0;
        Thread t = Thread.currentThread();
        System.out.println("Current thread name = "+t.getName());
        while(i<40)
        {
        System.out.println("In mythread1 runnable");
        i++;
        }
    }
}
class MyThread2 implements Runnable 
{
public void run()
{   int i=0;
    Thread t = Thread.currentThread();
     System.out.println("Current thread name = "+t.getName());
    while(i<40)
    {
    System.out.println("In Mythread2 runnable");
    i++;
    }
}

}
public class runnable {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);
        Thread t = Thread.currentThread();
        System.out.println("Current thread name = "+t.getName());
        gun1.start();
        gun2.start();
    }
}
