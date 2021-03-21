/*
 * Quick Sort using Hoare's Partition
 */

import java.util.*;
class Qsort_Hp
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
            int p=hPartition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }
  static int hPartition(int arr[],int l,int h) 
  {
      int pivot=arr[l];
      int i=l-1,j=h+1;
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
