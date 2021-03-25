import java.util.*;
class Distinct
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i] = Integer.valueOf(sc.nextInt());
        int res=countDistinct(arr);
        System.out.println(res);
    }
    static int countDistinct(Integer arr[])
    {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
        return hs.size();        
    }
}