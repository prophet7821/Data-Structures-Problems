/*
 * Finding First and Last Occurence of a number using Linear Search
 */

import java.util.*;
class Index
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the limit of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter a number to know its first and last occurence");
        int x=sc.nextInt();
        int first=firstOcc(arr,n,x);
        int last=lastOcc(arr,n,x);
        if(first==-1&&last==-1)
        System.out.println("Element not present");
        else
        System.out.println(first+" "+last);
    }
    static int firstOcc(int arr[],int n, int x)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            high=mid-1;
            else if(arr[mid]<x)
            low=mid+1;
            else
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                return mid;
                else 
                high=mid-1;
            }
        }
        return -1;
    }
    static int lastOcc(int arr[],int n,int x)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            high=mid-1;
            else if(arr[mid]<x)
            low=mid+1;
            else
            {
                if(mid==n-1||arr[mid]!=arr[mid+1])
                return mid;
                else
                low=mid+1;
            }
        }
        return -1;
    }
}

