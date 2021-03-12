import java.util.*;
class Insertion_Sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        insertionSort(arr , n);
    }
    static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
}