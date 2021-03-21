/*
 * Intersection of two Sorted Arrays
 */
import java.util.*;
class Intersection
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the first  array");
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n1;i++)
        a1[i]=sc.nextInt();
        System.out.println("Enter the limit of the second array");
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n2;i++)
        a2[i]=sc.nextInt();
        intersection(a1,a2,n1,n2);
    }
    static void intersection(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(a[i]<b[j])
            i++;
            else if(a[i]>b[j])
            j++;
            else
            {
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }
    }
}
