/*
 * Smallest Number reapeating k times
 */
import java.util.*;
class SmallK
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int  n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int res=findDuplicate(arr,n,k);
        if(res==-1)
        System.out.println("No such element");
        else
        System.out.println(res);
    }
    static int findDuplicate(int arr[],int n,int k)
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            if(e.getValue()==k)
            min=Math.min(min,e.getKey());
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        else 
        return min;
    }
}