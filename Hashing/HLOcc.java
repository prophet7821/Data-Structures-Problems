/*
 * Given an array, the task is to find the difference between highest occurrence and lowest occurrence of any number in an array.
 */
import java.util.*;
class HLOcc
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
        int res=findDiff(a,n);
        System.out.println(res);
    }
    static int findDiff(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            min=Math.min(min,e.getValue());
            max=Math.max(max,e.getValue());
        }
        if(max==min)
        return 0;
        else
        return max-min;
    }
}
