/*
 * Sub-Array with given sum
 */
import java.util.*;
class SubSum
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the  array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i] =sc.nextInt();
        System.out.println("Enter the Sum");
        int sum=sc.nextInt();
        boolean res=isSum(arr,n,sum);
        if(res==true)
        System.out.println("Found");
        else 
        System.out.println("Not Found");
    }
    static boolean isSum(int arr[], int n, int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(pre_sum==sum)
                return true;
            pre_sum += arr[i];
            if(s.contains(pre_sum-sum) == true)
                return true;
            s.add(pre_sum);
        }
        return false;
    }
}
