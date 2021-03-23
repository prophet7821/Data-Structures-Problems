import java.util.*;
class Bool_Mat
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the boolean elemets of the matrix");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
        booleanMatrix(arr,n);
    }
    static void booleanMatrix(int arr[][],int n)
    {
        int r[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            if(arr[i][j]==1)
            {
                r[i]=1;
                c[i]=1;
            }
        }
        for(int i =0; i < n; i++)
        {
            for(int j = 0; j <n; j++)
            {
                if(r[i] == 1 || c[j] == 1)
                {
                    arr[i][j] = 1;
                }
            }
        }
        for(int i =0; i < n; i++)
        for(int j = 0; j <n; j++)
        System.out.println("  "+arr[i]);
    }
}