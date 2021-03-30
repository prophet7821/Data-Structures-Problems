/*Given two arrays A and B of size N,
 *the task is to find the maximum sum possible of a window in array B 
 *such that elements of the same window in array A are unique.
 */
import java.util.*;
class Max_Sum_Poss
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        long a[]=new long[n];
        long b[]=new long[n];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextLong();
        for(int i=0;i<n;i++)
        b[i]=sc.nextLong();
        System.out.println(returnMaxSum(a,b,n));
    }
    static long returnMaxSum(long a[], long b[],int n)
    {
        long result=0,curr_sum=0,curr_begin=0;
        HashSet<Long> h=new HashSet<Long>();
        for(int i=0;i<n;i++)
        {
            while(h.contains(a[i]))
            {
                h.remove(a[(int)curr_begin]);
                curr_sum-=b[(int)curr_begin];
                curr_begin++;
            }
            h.add(a[i]);
            curr_sum+=b[i];
            result=Math.max(result,curr_sum);
        }
        return result;
    }
}