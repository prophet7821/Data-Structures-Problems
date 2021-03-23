/*
 * You are given an array arr[] of N integers including 0. 
 * The task is to find the smallest positive number missing from the array.
 */

import java.util.*;
class On_Positive
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
        int res=missingNumber(arr,n);
        System.out.println(" "+res);
    }
    static int missingNumber(int arr[],int n)
    {
        int shift = segregate (arr, n);
        int arr2[] = new int[n-shift];
        int j=0;
        for(int i=shift;i<(n);i++)
        {
            arr2[j] = arr[i];
            j++;
        }
       return findthatbitch(arr2, j);
    }
    static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;  
           }
        } 
        return j;
    }
    static int findthatbitch(int arr[], int size)
    {
      
      int i;
      for(i = 0; i < size; i++)
      {
        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
      }
      for(i = 0; i < size; i++)
        if (arr[i] > 0)
          return i+1;
      return size+1;
    }
}