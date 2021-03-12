/*
 * This program solves using two pointer approach
 */
import java.util.*;
class TwoPoint
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
        System.out.println("Enter the sum to be searched");
        int x=sc.nextInt();
        boolean res=isPair(arr,n,x);
        if(res==false)
        System.out.println("Not found");
        else
        System.out.println("Found ");
    }
    static boolean isPair(int arr[],int n,int x)
    {
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==x)
            return true;
            else if(arr[left]+arr[right]>x)
            right--;
            else
            left++;
        }
        return false;
    }
}
