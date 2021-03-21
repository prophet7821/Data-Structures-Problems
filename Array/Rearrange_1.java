/*
 * Reaarranging an array where arr[i]=arr[arr[i]],where elements is between 0-(n-1);
 */
import java.util.*;
class Rearrange_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array between 0 and n-1");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        rearrange(arr,n);
        for(int i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
    static void rearrange(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        arr[i]+=(arr[arr[i]]%n)*n;
        for(int i=0;i<n;i++)
        arr[i]=arr[i]/n;
    }
}