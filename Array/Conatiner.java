/*Given N non-negative integers a1,a2,....an 
 *where each represents a point at coordinate (i, ai). 
 *N vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i,0). 
 *Find two lines, which together with x-axis forms a container, such that it contains the most water. 
 */

import java.util.*;
class Conatiner
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=aContainer(arr,n);
        System.out.println(" "+res);
    }
    static int aContainer(int arr[], int n){
        int l = 0;      
    	int r = n -1; 
    	int area = 0;
    	while (l < r)
    	{
    		area = Math.max(area, Math.min(arr[l], arr[r]) * (r - l));
    		if (arr[l] < arr[r])
    			l += 1;
    		else
    			r -= 1;
    	}
    	return area;
    }
}
