/*Printing in lowest greatest order
 */
import java.util.*;
class Rearrange
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
        reArrange(arr,n);
    }
    static void reArrange(int arr[],int n)
    {
        int temp[]=new int[n];
        int tIndex=0;
        int i=0,j=n-1;
        while(i<j)
        {
            temp[tIndex++]=arr[i++];
            temp[tIndex++]=arr[j--];
        }
        if(i==j)
        temp[tIndex]=arr[i];
        for(i=0;i<n;i++)
        System.out.println(temp[i]);
    }
}

        