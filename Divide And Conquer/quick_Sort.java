

public class quick_Sort {
    
    static void quickSort(int []arr,int left,int right)
    {
        if(left>=right)
        {
            return;
        }

    int pivot = partition(arr,left,right);
    quickSort(arr,left,pivot-1);
    quickSort(arr,pivot+1,right);
    }
    static int partition(int []arr,int left,int right)
    {
        int pivot = arr[right];
        int fix = left-1;
        for(int i=left;i<right;i++)
        {
            if(arr[i]<=pivot)
            {
                fix++;
                int temp = arr[fix];
                arr[fix]=arr[i];
                arr[i]=temp;
            }
        }
        fix++;
        int temp = arr[right];
        arr[right]=arr[fix];
        arr[fix]=temp;
        return fix;
    }
    public static void printArr(int []arr)
    {
        System.out.println("Array after sorting :");
        for(int i : arr)
        System.out.print(i+" ");
    }
    public static void main(String args[])
    {
        int arr[] = {8,3,4,9,10,11,-1,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
