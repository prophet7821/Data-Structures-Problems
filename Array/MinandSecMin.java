import java.util.*;
class MinandSecMin
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
        Arrays.sort(arr);
        int max=arr[0];
        int sec_max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        if(arr[i]!=max)
        sec_max=arr[i];
        if(sec_max==Integer.MIN_VALUE)
        System.out.println("-1");
        else
        System.out.println(max+" "+sec_max);
    }
}
