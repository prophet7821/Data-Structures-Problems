import java.util.*;
class Selection_Sort
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
        selectionSort(arr , n);
    }
    static void selectionSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<n;j++)
            if(arr[j]<arr[min_ind])
            min_ind=j;
            int temp=arr[min_ind];
            arr[min_ind] = arr[i]; 
            arr[i] = temp; 
        }
        for(int i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    } 
}

            