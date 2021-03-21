import java.util.*;
class Transpose
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
        transpose(arr,n);
    }
    static void transpose(int arr[][],int n)
    {
        int temp=0;
        for(int i=0;i<n;i++)
        for(int j=i+1;j<n;j++)
        {
            temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        System.out.println(" "+arr[i][j]);
    }
}
