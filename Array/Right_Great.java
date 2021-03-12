/*
 * Finding the leader elements
 */
import java.util.*;
class Right_Great
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of then array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        nextGreatest(arr,n);
    }
    static void nextGreatest(int arr[], int n) 
    {
	    int max_from_right = arr[n - 1];
	    arr[n - 1] = -1;
	    for (int i = n - 2; i >= 0; i--) 
	    {
	        int temp = arr[i];
	        arr[i] = max_from_right;

	        if (max_from_right < temp)
	            max_from_right = temp;
	    }
	    for(int i=0;i<n;i++)
	    System.out.println(arr[i]+" ");
	}
}
