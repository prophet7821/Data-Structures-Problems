/*
 * Given an array of elements.
 * The task is to calculate the cumulative frequency of each element of the array.
 */
import java.util.*;
class Cumm_Freq
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
        ArrayList<Integer> l=countFreq(arr,n);
        System.out.println(l);
    }
    static ArrayList<Integer> countFreq(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        int cumul=0;
        for(int i=0;i<n;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            cumul+=e.getValue();
            list.add(cumul);
        }
        return list;
    }
}