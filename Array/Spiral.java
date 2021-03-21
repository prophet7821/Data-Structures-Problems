import java.util.*;
class Spiral
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
        printSpiral(arr,n,n);
    }
    static void printSpiral(int arr[][],int r,int c)
    {
        int top=0,left=0,bottom=r-1,right=c-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<right;i++)
            System.out.println(" "+arr[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
            System.out.println(" "+arr[i][right]);
            right--;
            if(top<=bottom){
                 for(int i=right;i<=left;i--)
                 System.out.println(" "+arr[bottom][i]);
                 bottom--;
                }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                System.out.println(" "+arr[i][left]);
                left++;
            }
        }
    }
}

            