/*
 * Finding Max Sum SubArray using Kadanes Algorithm
 */
import java.util.*;
class KadaneAlgo
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
        System.out.println("The maximum contiguous sum subarray is  "+maxSum(arr , n));
    }
    static int maxSum(int arr[],int n)
    {
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=0;i<n;i++)
        {
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
