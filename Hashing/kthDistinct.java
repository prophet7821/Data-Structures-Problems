/*
 * Given an array of n integers. Find the kth distinct element.
 */
import java.util.*;
class kthDistinct
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int res=kthDistinct(a,n,k);
        System.out.println(res);
    }
    static int kthDistinct(int arr[],int n,int k)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        if(h.size()<k)
        return -1;
        for(int i=0;i<n;i++)
        {
            if(h.get(arr[i])==1)
            ++count;
            if(count==k)
            return arr[i];
        }
        return -1;
    }
}
