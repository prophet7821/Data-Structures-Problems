import java.util.*;
class Third_Largest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        if(n<3)
        System.exit(0);
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int first=0,second=0,third=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;
                first=arr[i];
            }
            if(arr[i]<first&&arr[i]>second)
            {
                third=second;
                second=arr[i];
            }
        }
        System.out.println("The Third Largest element is "+third);
    }
}
