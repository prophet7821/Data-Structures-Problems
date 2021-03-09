import java.util.*;
class Rev_SubArray
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
        System.out.println("Enter the left limit");
        int l=sc.nextInt();
        System.out.println("Enter the right limit");
        int r=sc.nextInt();
        int i=l-1,j=r-1,temp=0;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            ++i;
            --j;
        }
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}
