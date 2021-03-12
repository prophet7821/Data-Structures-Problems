import java.util.*;
class RSearch
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
        System.out.println("Enter the number to be searched");
        int x=sc.nextInt();
        int res=Search(arr,n,x);
        if(res==-1)
        System.out.println("Not found");
        else
        System.out.println("Found at "+(res+1)+" position ");
    }
    static int Search(int arr[],int n,int x)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            return mid;
            if(arr[low]<arr[mid])
            {
                if(x>=arr[low]&&x<arr[mid])
                high=mid-1;
                else
                low=mid+1;
            }
            else
            {
                if(x<=arr[high]&&x>arr[mid])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return -1;
    }
}
