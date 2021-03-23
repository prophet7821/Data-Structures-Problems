/*
 * Given a boolean 2D array of n x m dimensions where each row is sorted.
 * Find the 0-based index of the first row that has the maximum number of 1's.
 */
import java.util.*;
class Max_1_s
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the binary elements of the matrix");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
        int res=binary2d(arr,n);
        System.out.println(" "+res);
    }
       static int binary2d(int arr[][],int n)
        {
        int max=0,res=0;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                ++k;
            }
            if(max<k)
            {
                max=k;
                res=i;
            }
        }
        return (res+1);
    }
}