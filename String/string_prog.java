
import java.util.*;
public class string_prog {
    public static boolean check_pallindrome(String str)
    {
   int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            return false;
            left++;
            right--;
            
        }
        return true;
    }
    public static String substring(String str,int left,int right)
    {
       String st = "";
       for(int i=left;i<=right;i++)
        st+=str.charAt(i);
       
       return st;
    }
    public static String largstr(String str[])
    { String larg=str[0];
      for(int i=1;i<str.length;i++)
      {
        if(larg.compareTo(str[i])<0)
        larg=str[i];
      }
      return larg;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string");
        // String str = sc.next();
        // System.out.println(str+" is pallindrome : "+check_pallindrome(str));
        // String str1="Shiva Sharma";
        // System.out.println(substring(str1,2,8));
        String str2[]={"Apple","Banana","Orange","orange"};
        System.out.println("Largest string = "+largstr(str2));
        sc.close();
    }
    
}
