/*
 * Stock buy and sell problem
 */
import java.util.*;
class Stock
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the price of stocks in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pro=maxProfit(arr,n);
        System.out.println(pro);
    }
    static int maxProfit(int price[],int n)
    {
        int profit=0;
        for(int i=1;i<n;i++)
        if(price[i]>price[i-1])
        profit+=price[i]-price[i-1];
        return profit;
    }
}
