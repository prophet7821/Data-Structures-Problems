/*
 * Check if a given array is in A.P
 */

import java.util.*;
class Arithmatic_Prog
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        boolean res=isAP(a,n);
        if(res==true)
        System.out.println("The array is in AP");
        else
        System.out.println("The array is not in AP");
    }
    static boolean isAP(int arr[],int n)
    {
        Arrays.sort(arr);
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=1;i<n-1;i++)
        h.add(arr[i]-arr[i-1]);
        if(h.size()>1)
        return false;
        else
        return true;
    }
}