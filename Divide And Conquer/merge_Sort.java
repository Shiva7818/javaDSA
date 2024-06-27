public class merge_Sort {
    static void mergeSort(int arr[],int left,int right)
    {
        if(left>=right)
        return;
        int mid = left + (right-left)/2;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int []arr,int left,int mid,int right)
    {
    int temp[] = new int[right-left+1];
    int i=left,j=mid+1,k=0;
    while(i<=mid&&j<=right)
    {
        if(arr[i]<=arr[j])
        {
       temp[k++]=arr[i++];
        }
        else
        {
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid)
    {
        temp[k++]=arr[i++];
    }
    while(j<=right)
    {
        temp[k++]=arr[j++];
    }
    for(int l=0;l<k;l++)
    {
    arr[left++]=temp[l];
    }
    }
    public static void printArr(int []arr)
    {
        System.out.println("Array after sorting :");
        for(int i : arr)
        System.out.print(i+" ");
    }
    public static void main (String args[])
    {
        int arr[] = {8,3,4,9,10,11,-1,5,-9,-7};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
    
}
