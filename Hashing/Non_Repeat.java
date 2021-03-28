/*
 * Find the first non-repeating element in a given array arr of N integers.
 */
import java.util.*;
class Non_Repeat
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
        int res=firstNonRepeating(arr,n);
        System.out.println(res);
    }
    static int firstNonRepeating(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        for(int i=0;i<n;i++)
        if(h.get(arr[i])==1)
        return arr[i];
        return 0;
    }
}

    