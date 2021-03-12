/*
 * Linear Searching
 */
import java.util.*;
class LSearch
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
        System.out.println("Enter the number to be searched");
        int x=sc.nextInt();
        int k=lsearch(arr,x);
        if(k==-1)
        System.out.println("Number not found ");
        else
        System.out.println("Found at "+k);
    }
    static int lsearch(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        if(arr[i]==x)
        return i;
        return -1;
    }
}
