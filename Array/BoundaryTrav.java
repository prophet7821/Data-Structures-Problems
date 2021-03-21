import java.util.*;
class BoundaryTrav
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elemets of the matrix");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
        bTraversal(arr , n , n);
    }
    static void bTraversal(int arr[][],int r,int c)
    {
        if(r==1)
        for(int i=0;i<c;i++)
        System.out.println(" "+arr[0][i]);
        else if(c==1)
        for(int i=0;i<r;i++)
        System.out.println(" "+arr[i][0]);
        else
        {
            for(int i=0;i<c;i++)
            System.out.println(" "+arr[0][i]);
            for(int i=1;i<r;i++)
            System.out.println(" "+arr[i][c-1]);
            for(int i=c-2;i>=0;i--)
            System.out.println(" "+arr[r-1][i]);
            for(int i=r-2;i>=1;i--)
            System.out.println(" "+arr[i][0]);
        }
    }
}
