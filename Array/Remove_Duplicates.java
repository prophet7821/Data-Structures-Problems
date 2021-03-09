import java.util.*;
class Remove_Duplicates
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
        int j=removeDuplicates(arr,n);
        System.out.println(j);
    }
    static int removeDuplicates(int arr[],int n)
    {
        int j=0;
        for(int i=0;i<n-1;i++)
        if(arr[i]!=arr[i+1])
        arr[j++]=arr[i];
        arr[j++]=arr[n-1];
        return j;
    }
}
