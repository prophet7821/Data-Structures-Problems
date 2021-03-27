/*
 * Given an array of N integers. Find the first element that occurs K number of times. 
 */
import java.util.*;
class FirstK
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
        int res=kTime(a,n,k);
        if(res==-1)
        System.out.println("No such element");
        else
        System.out.println(res);
    }
    static int kTime(int a[],int n,int k)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            h.put(a[i],h.getOrDefault(a[i],0)+1);
            if(h.get(a[i])==k)
            return a[i];
        }
        return -1;
    }
}