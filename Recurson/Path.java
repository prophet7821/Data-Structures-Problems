import java.util.*;
class Path
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of the 2D Array");
        int n=sc.nextInt();
        int total=pathAdd(n,n);
        System.out.println("Number of ways to get from top left to bottom right of an 2D array of dimension "+n+" is "+total);
    }
    static int pathAdd(int x ,int y)
    {
        if(x==1||y==1)
        return 1;
        else
        return pathAdd(x-1,y)+pathAdd(x,y-1);
    }
}
