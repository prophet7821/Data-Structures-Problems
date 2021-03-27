/*
 * Pair with a given sum
 */
import java.util.*;
class PairSum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the  array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i] =sc.nextInt();
        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        boolean res=isPair(arr,n,sum);
        if(res==true)
        System.out.println("Found");
        else
        System.out.println("Not Found");
    }
    static boolean isPair(int arr[],int n,int sum)
    {
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(s.contains(sum-arr[i]))
            return true;
            s.add(arr[i]);
        }
        return false;
    }
}
