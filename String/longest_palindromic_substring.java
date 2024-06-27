public class longest_palindromic_substring {
    public static void main(String args[])
    {
        String st="aaaaaaaaaaaaaaaaaaa";
        StringBuilder stb = new StringBuilder();
        for(int i=0;i<st.length()-1;i++)
        {
            int left=i,right=st.length()-1,j=1;
            while(left<right)
            {
                if(st.charAt(left)!=st.charAt(right))
                {
                          left=i;
                          right=st.length()-j;
                          j++;

                }
               else{ left++;
                right--;
               }

            }
            if(j<=st.length()-i)
            {  if((st.length()-j+1)-i+1>stb.length())
                {stb.delete(0, stb.length());
                for(int k=i;k<=st.length()-j+1;k++)
                {
                    stb.append(st.charAt(k));
                }
            }
            }
        }
        System.out.println(stb);
    }
}
