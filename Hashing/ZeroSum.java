/*
 * Checking SubArray has zero sum
 */
import java.util.*;
class ZeroSum
{
    public static void main () 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the  array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i] =sc.nextInt();
        int res=ZeroSumSubarray(arr,n);
        if(res==1)
        System.out.println("Found");
        else 
        System.out.println("Not Found");
    }
    static int ZeroSumSubarray(int arr[], int n)
    {
        HashSet<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);
        for(int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];
            if(us.contains(prefix_sum) == true)
              return 1;   
            us.add(prefix_sum);
        }
        return 0;
    }
}
