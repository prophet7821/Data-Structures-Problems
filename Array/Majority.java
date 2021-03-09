import java.util.*;
class Majority
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int k=majorityElements(arr,n);
        if(k==-1)
        System.out.println("No majority elements");
        else
        System.out.println(arr[k]+" is a majority element");
    }
    static int majorityElements(int a[],int n)
    {
        int compare=0,count=0,maxCount=0,index=0;
        for(int i=0;i<n-1;i++)
        {
            compare=a[i];count=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                ++count;
            }
            if(maxCount<count)
            {
                maxCount=count;
                index=i;
            }
        }
        if(maxCount>n/2)
        return index;
        else 
        return -1;
    }
}
