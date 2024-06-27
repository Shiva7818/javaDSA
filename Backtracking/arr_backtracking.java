

public class arr_backtracking {
    public static void printarr(int arr[])
    {   
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void changarr(int arr[],int i,int val)
    {
       if(i==arr.length)
       {
        printarr(arr);
        return;
       }
       arr[i]=val;
       changarr(arr,i+1,val+1);
       arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changarr(arr,0,1);
        printarr(arr);
    }
    
}
