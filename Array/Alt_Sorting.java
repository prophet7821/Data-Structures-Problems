import java.util.*;
class Alt_Sorting
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
        alternateSort(arr,n);
    }
    static void alternateSort(int arr[],int n)
    {
        int temp[]=new int[n];
        int i=0,j=n-1,tmp=0;
        while(i<j)
        {
            temp[tmp++]=arr[j--];
            temp[tmp++]=arr[i++];
        }
        if(i==j)
        temp[tmp]=arr[j];
        for(i=0;i<n;i++)
        System.out.println(temp[i]);
    }
}

        