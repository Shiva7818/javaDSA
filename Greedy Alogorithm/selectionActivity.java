
import java.util.*;
public class selectionActivity {
    public static void main(String args[])
    {
        int start[] = {1,3,0,5,8,5};
        int finish[] = {2,4,6,7,9,9};
        int lastFinish=-1;
        ArrayList<String> list = new ArrayList<>();
        list.add("A1");
        lastFinish=finish[0];
        for(int i=1;i<finish.length;i++)
        {
          if(start[i]>=lastFinish)
          {
            list.add("A"+Integer.toString(i+1));
            lastFinish=finish[i];
          }
        }
        System.out.print("Jobs to be done ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
