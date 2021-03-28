/*
 * Given an array of integers and a number K.
 * Find the count of distinct elements in every window of size K in the array.
 */
import java.util.*;
class Distinct_Win
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
        System.out.println("Enter the window");
        int k=sc.nextInt();
        System.out.println(countDistinct(arr,n,k));
    }
    static ArrayList<Integer> countDistinct(int arr[],int n,int k)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            list.add(h.size());
        }
        for(int i=k;i<n;i++)
        {
            if(h.get(arr[i-k])>1)
                h.put(arr[i-k],h.get(arr[i-k])-1);
            else
                h.remove(arr[i-k]);
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            list.add(h.size());
        }
        return list;
    }
}
 