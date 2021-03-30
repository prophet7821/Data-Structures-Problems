/*
 * Given two sorted matrices mat1 and mat2 of size N x N of elements. 
 * Given a value x. The problem is to count all pairs from both matrices whose sum is equal to x.
 */
import java.util.*;
class Count_Pair_Mat
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("Enter the elements of the 2D array");
        for(int i=0;i<n;i++)
            for(int j=0;i<n;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<n;i++)
            for(int j=0;i<n;j++)
                b[i][j]=sc.nextInt();
        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        System.out.println(countPairs(a,b,n,sum));
    }
    static int countPairs(int mat1[][], int mat2[][], int n, int x)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        h.put(mat1[i][j],h.getOrDefault(mat1[i][j],0)+1);
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        if(h.containsKey(x-mat2[i][j]))
        count+=h.get(x-mat2[i][j]);
        return count;
    }
}
