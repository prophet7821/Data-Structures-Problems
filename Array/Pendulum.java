/*
 * Pendulum Sorting an Array
 */
import java.util.*;
class Pendulum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);int i,j=1;
        int mid=(n-1)/2;
        temp[mid]=arr[0];
        for(i=1;i<=mid;i++)
        {
            temp[mid+i]=arr[j++];
            temp[mid-i]=arr[j++];
        }
        if(n%2==0)
        temp[mid+i]=arr[j];
        for(i=0;i<n;i++)
        System.out.println(temp[i]);
    }
}
