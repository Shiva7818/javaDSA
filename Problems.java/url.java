import java.net.*;
public class url {
    public static void main(String args[])throws Exception
    {
URL u = new URL("https://www.geeksforgeeks.org/java-util-vector-class-java/");
    System.out.println("Protocol"+u.getProtocol());
    }
}
