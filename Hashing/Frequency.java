/*
 * Frequency of elementgs present in na array
 */
import java.util.*;
class Frequency
{
    public static void main () 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        arr[i] =sc.nextInt();
        countFreq(arr,n);
    }
    static void countFreq(int arr[], int n)
    {
        HashMap<Integer, Integer> h= new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(h.containsKey(arr[i]) == true)
              h.put(arr[i], h.get(arr[i]) + 1);
            else
              h.put(arr[i], 1);    
        }
        for(Map.Entry<Integer, Integer> itr: h.entrySet())
        System.out.println(itr.getKey() + " " + itr.getValue());
     }
}