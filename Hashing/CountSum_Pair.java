/*
 * Given an array A of distinct integers. 
 * The task is to find if there are two pairs (a, b) and (c, d) such that a+b = c+d, and elements of array are distinct.
 */
import java.util.*;
class CountSum_Pair
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
        CountSum_Pair ob=new CountSum_Pair();
        int res= ob.findPairs(arr,n);
        System.out.println(res);
    }
    class pair 
    { 
        int first, second; 
        pair(int f,int s) 
        { 
            first = f; second = s; 
        } 
    }; 
    int findPairs(int arr[],int n)
    {
        HashMap<Integer,pair>h=new HashMap<Integer,pair>();
        for(int i=0; i<n; ++i) 
        { 
            for (int j=i+1; j<n; ++j) 
            { 
                int sum = arr[i]+arr[j]; 
                if (!h.containsKey(sum))
                {
                    pair p=new pair(i,j);
                    h.put(sum,p); 
                }
                else  
                    return 1;
            } 
        } 
        return 0; 
    }
} 