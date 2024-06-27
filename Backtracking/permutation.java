public class permutation {
    public static void permutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            permutation(newstr,ans+c);
        }
    }
    public static void main(String[] args) {
        
String str = "abc";
String ans="";
permutation(str,ans);
    }
    
}
