import java.util.*;
class Max_Sum
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
        int res=max(arr,n);
        System.out.println(" "+res);
    }
    static int max(int arr[],int n)
    {
        int cum_sum=0;
        for(int i=0;i<n;i++)
        cum_sum+=arr[i];
        int initial_value=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            initial_value+=i*arr[i];
            max=initial_value;
        }
        for(int i=1;i<n;i++)
        {
            int temp=initial_value-(cum_sum-arr[i-1])+arr[i-1]*(n-1);
            initial_value=temp;
            if(temp>max)
            max=temp;
        }
        return max;
    }
}
