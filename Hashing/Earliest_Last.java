/*
 * Given an array arr of N integers that might contain duplicates,
 * find the element whose last appearance is earliest.
 */
import java.util.*;
class Earliest_Last
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
        int res= findEarlyLatest(arr,n);
        System.out.println(res);
    }
    static int findEarlyLatest(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        h.put(arr[i],i);
        int min=Integer.MAX_VALUE;
        for(HashMap.Entry<Integer,Integer>e:h.entrySet())
        min=Math.min(min,e.getValue());
        return arr[min];
    }
}