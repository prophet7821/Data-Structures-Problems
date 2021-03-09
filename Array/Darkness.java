import java.util.*;
class Darkness
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of candles");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the length of the candles");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        boolean flag=false;int count=0;
        while(flag==false)
        {
            for(int i=0;i<n;i++)
            arr[i]=arr[i]-1;
            ++count;
            flag=check(arr , n);
        }
        System.out.println("The room can be "+count+" days without darkness");
    }
    static boolean check(int a[],int k)
    {
        for(int i=0;i<k;i++)
        if(a[i]!=0)
        {
            return false;
        }
        return true;
    }
}
