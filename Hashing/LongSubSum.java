/*
 * Given an array having both positive and negative integers. 
 * The task is to compute the length of the largest subarray with sum 0.
 */
import java.util.*;
class LongSubSum
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
        int res=maxLen(arr,n);
        System.out.println(res);
    }
    static int maxLen(int arr[], int n)
    {
        int sum=0;
        HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
        int presum=0,res=0;
        for(int i=0;i<n;i++)
        {
            presum+=arr[i];
            if(presum==sum)
                res=i+1;
            if(m.containsKey(presum)==false)
                m.put(presum,i);
            if(m.containsKey(presum-sum))
                res=Math.max(res,i-m.get(presum));
        }
        return res;
    }
}