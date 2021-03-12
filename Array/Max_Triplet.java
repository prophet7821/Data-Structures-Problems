/*
 * Sum of max three numbers
 */
import java.util.*;
class Max_Triplet
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
        int res=maximumTriplet(arr,n);
        System.out.println("The maximum triplet sum "+res);
    }
    static int maximumTriplet(int arr[],int n)
    {
        int a=Integer.MIN_VALUE , b=Integer.MIN_VALUE , c=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
		if (arr[i] > a) {
			c = b;
			b = a;
			a = arr[i];
		}
		else if (arr[i] > b) {
			c = b;
			b= arr[i];
		}
		else if (arr[i] > c)
			c= arr[i];
	}
        return (a + b+c);
    }
}
