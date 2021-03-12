/*
 * Sorting a binary array using Quick Sort(Lomuto Partition)
 */
import java.util.*;
class BArray_Sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the binary array");
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
        qSort(arr,0,n-1);
        for(int x: arr)
	 System.out.print(x+" ");
    }
    static void qSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int p=partition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }
    static int partition(int arr[],int l,int h)
    {
        int pivot=arr[l];
        int i=l-1;int j=h+1;
        while(true)
        {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
            return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
