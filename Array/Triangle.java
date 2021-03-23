/*
 * Triangles in an array
 */
import java.util.*;
class Triangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=findNumberOfTriangles(arr,n);
        System.out.println(" "+res);
    }
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n-2; i++)
        {
            int k = i+2;
            for (int j = i+1; j < n; ++j)
            {
                while (k < n && arr[(int)i] + arr[(int)j] > arr[(int)k])
                        ++k;     
                count += k - j - 1;
            }
        }
        return count;
    }
}