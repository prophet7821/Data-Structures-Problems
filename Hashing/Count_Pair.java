/*
 * Given an array of N integers, and an integer K, 
 * find the number of pairs of elements in the array whose sum is equal to K.
 */
import java.util.*;
class Count_Pair
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
        System.out.println("Enter k");
        int k=sc.nextInt();
        int pair=getPairsCount(arr,n,k);
        System.out.println(pair);
    }
    static int getPairsCount(int[] arr, int n, int k)
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(k-arr[i]))
            count+=h.get(k-arr[i]); 
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
