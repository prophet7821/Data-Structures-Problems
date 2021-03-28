/*
 * You are given 3 different arrays A, B, and C of the same size N. Find the number of indexes i such that:
 * Ai = Bi + Ck 
 * where k lies between [1, N].
 */
import java.util.*;
class Sum_indexes
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        int a3[]=new int[n];
        System.out.println("Enter the elements of the array a1");
        for(int i=0;i<n;i++)
         a1[i]=sc.nextInt();
        System.out.println("Enter the elements of the array a2");
        for(int i=0;i<n;i++)
         a2[i]=sc.nextInt();
         System.out.println("Enter the elements of the array a3");
        for(int i=0;i<n;i++)
         a3[i]=sc.nextInt();
    }
    static int pairCount(int n, int a[], int b[], int c[])
    {
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        s.add(c[i]);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int temp:s)
            {
                if(a[i]==b[i]+temp)
                ++count;
            }
        }
        return count;
    }
}