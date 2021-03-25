/*
 * 
 */
import java.util.*;
import java.io.*;
import java.lang.*;

class Frequency
{
    public static void main (String[] args) 
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
        for(int x:arr)
        h.put(x,h.getOrDefault(x,0)+1);
        for(Map.Entry<Integer, Integer> e: h.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());
     }
}