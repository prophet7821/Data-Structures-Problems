import java.util.*;
class Grp_Rev
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
        System.out.println("Enter the pivot for every rotation");
        int k=sc.nextInt();
        reverse(arr,n,k);
    }
    static void reverse(int arr[], int n, int k) 
    { 
        for (int i = 0; i < n; i += k) 
        { 
            int left = i; 
            int right = Math.min(i + k - 1, n - 1); 
            int temp;  
            while (left < right) 
            { 
                temp=arr[left]; 
                arr[left]=arr[right]; 
                arr[right]=temp; 
                left+=1; 
                right-=1; 
            } 
        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    } 
}
