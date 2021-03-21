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
        int max=n-1,min=0;
        int max_element=arr[n-1]+1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            arr[i]+=(arr[max--]%max_element)*max_element;
            else
            arr[i]+=(arr[min++]%max_element)*max_element;
        }
        for(int i=0;i<n;i++)
        arr[i]=arr[i]/max_element;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}

        