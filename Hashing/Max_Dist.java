/*
 * Given an array with repeated elements, 
 * the task is to find the maximum distance between two occurrences of an element.
 */
import java.util.*;
class Max_Dist
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
        int dist=maxDistance(arr,n);
        System.out.println(dist);
    }
    static int maxDistance(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            h.put(arr[i],h.get(arr[i]));
            else
            h.put(arr[i],i);
            max=Math.max(max,i-h.get(arr[i]));
        }
        return max;
    }
}