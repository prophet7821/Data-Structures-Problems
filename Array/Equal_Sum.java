/*
 * 
 */
import java.util.*;
class Equal_Sum
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
    }
    static String equlibrium(int arr[],int n)
    {
        int sum=0,total_sum=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];
        for(int i=n-1;i>=0;i--)
        {
            sum-=arr[i];
            if(total_sum==sum)
            return "YES";
            total_sum+=arr[i];
        }
        return "NO";
    }
}
