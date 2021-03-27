/*
 * 
 */
import java.util.*;
class kthSmallest
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
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        list=kSmallestElements(arr,n,k);
        System.out.println(list);
    }
    static ArrayList<Integer> kSmallestElements(int a[], int n, int K)
    {
        Arrays.sort(a);
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<K;i++)
        {
            l.add(a[i]);
        }
        //System.out.println(l);
        return l;
    }
}