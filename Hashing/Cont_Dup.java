/*
 * Given an array of n integers(duplicates allowed).
 * Print “Yes” if it is a set of contiguous integers else print “No”.
 */
import java .util.*;
class Cont_Dup
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
        boolean res=elementsContiguous(arr,n);
        System.out.println(res);
    }
    static boolean elementsContiguous(int arr[],int n)
    {
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=0;i<n;i++)
            h.add(arr[i]);
        int count=1;
        int cur_ele=arr[0]-1;
        while(h.contains(cur_ele))
        {
            ++count;
            --cur_ele;
        }
        cur_ele=arr[0]+1;
        while(h.contains(cur_ele))
        {
            ++count;
            --cur_ele;
        }
        return (count==(int)h.size());
    }
}