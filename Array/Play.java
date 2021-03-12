/*
 * Swapping adjacent elements if right element is lesser than the left one
 */

import java.util.*;
class Play
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
        int result=formatArray(arr,n);
        System.out.println(result);
    }
    static int formatArray(int arr[],int n)
    {
        int i=0;
        while(i<n-1)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            i=i+2;
        }
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
        return 1;
    }
}

        