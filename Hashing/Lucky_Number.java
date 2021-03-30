/*
 * Proving lucky numbe
 */
import java.util.*;
class Lucky_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the array");
        Long n =new Long(sc.nextLong());
    }
    static int isLuckyOrNot(Long N)
    {
        String s=Long.toString(N);
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        String mini="";
        int k=1;
        for(int i=0;i<s.length();i++)
        {
            int a=0;
            for(int j=0;j<s.length();j=j+k)
            {
                mini=s.substring(a,Math.min(a+k,s.length()));
                if(k==1)
                a+=k;
                else
                a+=k-1;
                long b=Long.parseLong(mini);
                int mul=1;
                while(b>0)
                {
                    mul*=b%10;
                    b=b/10;
                }
                h.put(mul,h.getOrDefault(mul,0)+1);
            }
            ++k;
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        if(e.getValue()>1)
        return 0;
        return 1;
    }
}
