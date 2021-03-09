import java.util.*;
class Fine
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int fine[]=new int[n];
        System.out.println("Enter the car numbers in the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the fine of each cars respectively");
        for(int i=0;i<n;i++)
        fine[i]=sc.nextInt();
        System.out.println("Enter the date");
        int d=sc.nextInt();
        int f=0;
        if(d%2==0)
        {
            for(int i=0;i<n;i++)
            if(arr[i]%2!=0)
            f=f+fine[i];
        }
        else
        {
            for(int i=0;i<n;i++)
            if(arr[i]%2==0)
            f=f+fine[i];
        }
        System.out.println("The collected fine on the given date is "+f);
    }
}

        