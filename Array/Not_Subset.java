/*
 * Given a sorted array of N positive integers,
 * find the smallest positive integer S 
 * such that S cannot be represented as sum of elements of any subset of the given array set.
 */
import java.util.*;
class Not_Subset
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
        int res=findSmallest(arr,n);
        System.out.println(" "+res);
    }
    static int findSmallest(int arr[],int n)
    {
        int res=1;
        for(int i=0;i<n&&arr[i]<=res;i++)
        res+=arr[i];
        return res;
    }
}        