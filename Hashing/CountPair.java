/*
 * Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
 * Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.
 */
import java.util.*;
class CountPair
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the first  array");
        int m=sc.nextInt();
        int a1[]=new int[m];
        for(int i=0;i<m;i++)
        a1[i]=sc.nextInt();
        System.out.println("Enter the limit of second array");
        int n=sc.nextInt();
        int a2[]=new int[n];
        for(int i=0;i<n;i++)
        a2[i]=sc.nextInt();
        System.out.println("Enter the sum");
        int x=sc.nextInt();
        int res=countPairs(a1,a2,m,n,x);
        System.out.println(res);
    }
    static int countPairs(int a[],int b[],int m,int n,int x)
    {
        int l=0,r=n-1,count=0;
        while(l<m && r>=0)
        {
           if((a[l]+b[r])==x){
               l++;r--;++count;
            }
           else if(a[l]+b[r]>x)
           r--;
           else
           l++;
        }
        return count;
    }
}