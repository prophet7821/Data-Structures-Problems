/*
 * As the name suggests its the famous trapping rainwater problem
 */
import java.util.*;
class RainWaterProblem
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divisions in the rainwater trapbox");
        int n=sc.nextInt();
        System.out.println("Enter the boundary units in the rainwater trapbox");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int unitWater=getWater(arr , n);
        System.out.println("Total Water in the trapwater is "+unitWater+" units");
    }
    static int getWater(int arr[],int n)
    {
        int res=0;
        int lMax[]=new int[n];
        int rMax[]=new int[n];
        lMax[0]=arr[0];
        for(int i=1;i<n;i++)
        lMax[i]=Math.max(arr[i],lMax[i-1]);
        rMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        rMax[i]=Math.max(arr[i],rMax[i+1]);
        for(int i=1;i<n-1;i++)
        res=res+Math.min(lMax[i],rMax[i])-arr[i];
        return res;
    }
}
   