/*
 * Intersection of two arrays
 */
import java.util.*;
class Intersection
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the first  array");
        int m=sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<m;i++)
        arr1[i] =sc.nextInt();
        System.out.println("Enter the limit of the second  array");
        int n=sc.nextInt();
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<n;i++)
        arr2[i] =sc.nextInt();
        intersection(arr1,arr2,m,n);
    }
    static void intersection(int a[],int b[],int m,int n)
    {
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<m;i++)
        s.add(a[i]);
        int res=0;
        System.out.println("The intersecting elements are ");
        for(int i=0;i<n;i++)
        if(s.contains(b[i]))
        {
            ++res;
            s.remove(b[i]);
            System.out.println(" "+b[i]);
        }
    }
}
