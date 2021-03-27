/*
 * Checking for equal array
 */
import java.util.*;
class EquiArray
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the arrays");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        System.out.println("Enter the elements of first the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the elements of second the array");
        for(int i=0;i<n;i++)
        brr[i]=sc.nextInt();
        boolean res=equiArray(arr,brr,n);
        if(res)
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
    static boolean equiArray(int a[],int b[],int n)
    {
      HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        boolean flag=false;
        for(int i=0;i<n;i++)
        h.put(a[i],h.getOrDefault(a[i],0)+1);
        for(int i=0;i<n;i++)
        if(h.containsKey(b[i]))
        {
            int freq=h.get(b[i]);
            freq--;
            h.put(b[i],freq);
        }
        for(Map.Entry<Integer,Integer> entry: h.entrySet())
        {
            if(entry.getValue() != 0)
            {
                return false;
            }
        }
        return true;  
    }
}

