import java.util.*;
public class subsets {
    public static void subset(String st,String ans,int i)
    {
     if(i==st.length())
     {
        if(ans.length()==0)
        System.out.println("Null");
        
     else
        System.out.println(ans);
        return;
     }
     subset(st,ans+st.charAt(i),i+1);
     subset(st,ans,i+1);
      
    }
    public static void subset_sum(String st,String ans,int i,int tar)
    {
     if(i==st.length())
     {
          int sum=0;
        for(int j=0;j<ans.length();j++)
        {
            
            sum+=(int)ans.charAt(j);
        }
         if(sum==tar)
        System.out.println(ans);
        return;
     }
     subset_sum(st,ans+st.charAt(i),i+1,tar);
     subset_sum(st,ans,i+1,tar);
                                                                                                                                         
    }
   static List<List<Integer>>list = new ArrayList<>();
   static List<Integer> temp = new ArrayList<>();
    public static List<List<Integer>> subsets(int set[])
    {
     if(set.length==0||set==null)
     return list;
      helper(set,0,new ArrayList<>());
      return list;
    }
public static void helper(int set[],int index,List<Integer> temp)
{
    if(index==set.length)
    {
       list.add(new ArrayList<>(temp));
       return ;
    }
temp.add(set[index]);
helper(set,index+1,temp);
temp.remove(temp.size()-1);
helper(set,index+1,temp);
}
    public static void main(String[] args) {
        // String st="abc";
        // subset(st,"",0);
        // String st2 = "637245";
        // subset_sum(st2,"",0,9);
        int set[] = {1,2,3};
        System.out.println(subsets(set));

    }
    
}
