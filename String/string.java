import java.util.Scanner;
public class string {
    public static void main(String args[])
    {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objString1 = new String("xyz");
        String objString2 = new String("xyz");

        // System.out.println(literalString1==literalString2);
        // System.out.println(objString1==objString2);
        System.out.println(literalString1.equals(literalString2));
        System.out.println(objString1.equals(objString2));


    //  String formetting
    
    // System.out.println("Hello world,this is Shiva Sharma.I am from Bharat.I am 18 years old.I am pursing B.tech in Computer Science");
    // String name = "Shiva Sharma";
    // String Country = "Bharat" , Branch = "Computer Science";
    // int age = 18;
    // double cgpa = 8.75;
    // char per = '%';
    // boolean isittrue = true;
    // System.out.format("Hello world,this is %s.I am from %s.I am %d years old.I am pursing B.tech in %s,My cgpa is %f.I got 100%c marks in maths in board.These claims are %b",name,Country,age,Branch,cgpa,per,isittrue);

    // String formatstr = String.format("Hello world,this is %s.I am from %s.I am %d years old.I am pursing B.tech in %s",name,Country,age,Branch);
    // System.out.println(formatstr.length());
    // System.out.println(formatstr.isEmpty());
    // System.out.println(formatstr.toUpperCase());
    // System.out.println(formatstr);
    // System.out.println(formatstr.replace("Bharat","India"));
    // System.out.println(formatstr.contains("Abes"));

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name2 = sc.nextLine();
    System.out.format("%s\n",name2);
    System.out.printf("Hello %s,How old are you",name2);
    int age1 = sc.nextInt();
    System.out.printf("I am %d years old",age1);

    sc.close();
} 
}
