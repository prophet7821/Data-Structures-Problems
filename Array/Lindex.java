/*
 * Finding last Index of an array
 */
import java.util.*;
class Lindex
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number");
        String b=sc.nextLine();
        int l=b.length();int index=0;
        char arr[]=new char[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=b.charAt(i);
            if(arr[i]=='1')
            index=i;
        }
        System.out.println(index);
    }
}
