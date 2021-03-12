/*This program rotates an array on a given pivot
*/
import java.util.*;
class Rotate_Array
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
        System.out.println("Enter the pivot on which the array should be rotated");
        int d=sc.nextInt();
        int temp[]=new int[n];
        int j=n-d;;
        for(int i=0;i<d;i++)
        temp[j+i]=arr[i];
        for(int i=0;i<j;i++)
        temp[i]=arr[d+i];
        System.out.println("The rotated array is");
        for(int i=0;i<n;i++)
        System.out.println(temp[i]);
    }
}
        