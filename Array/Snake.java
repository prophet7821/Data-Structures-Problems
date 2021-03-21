import java.util.*;
class Snake
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
        printSnake(arr , n);
    }    
    static void printSnake(int arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            for(int j=0;j<n;j++)
            System.out.println(arr[i][j]+" ");
            else
            for(int j=n-1;j>=0;j--)
            System.out.println(arr[i][j]+" ");
        }
    }
}
