/*
 * Finding Triplets with zero sum
 */
import java.util.*;
class ZeroTriplet
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
    }
    static boolean findTriplets(int arr[],int n)
    {
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            while(l<r){

                if(x+arr[l]+arr[r]==0)
                    return true;
                else if(x + arr[l] + arr[r] < 0)
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}

