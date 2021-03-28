/*
 * find the top k elements which have the highest frequency in the array.
 * If two numbers have the same frequency then the larger number should be given preference. 
 */
import java.util.*;
class Kfreq
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
        freqCount(arr,n);
    }
    static void freqCount(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        int freq[]=new int[n];
        for(int i=0;i<n;i++)
        if(h.containsKey(i+1))
        arr[i]=h.get(i+1);
        else
        arr[i]=0;
    }
}