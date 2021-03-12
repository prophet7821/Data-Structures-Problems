import java.util.*;
class Bubble
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr , n);
    }
    static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
}
