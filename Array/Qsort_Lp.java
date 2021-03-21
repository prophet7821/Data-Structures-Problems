/*
 * Quick Sort using Lomuto's Partition
 */

import java.util.*;
class Qsort_Lp
{
  public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        qSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
  static void qSort(int arr[] ,int l, int h)
    {
        if(l<h)
        {
            int p=lPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }
  static int lPartition(int arr[],int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        int temp=0;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
}
