/*
 * 
 */
import java.util.*;
class DistinctStream
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
        ArrayList<Integer> res=solution(arr,n);
        System.out.println(res);
    }

    static ArrayList<Integer> solution(int arr[],int n)
    {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0&&h.containsKey(-arr[i]))
            {
                if(h.get(-arr[i])==1)
                    h.remove(Math.abs(arr[i]));
                else
                {
                    int freq=h.get(-arr[i]);
                    --freq;
                    h.put(-arr[i],freq);
                }
                list.add(h.size());
            }
            else if(arr[i]>0){
                h.put(arr[i],h.getOrDefault(arr[i],0)+1);
                list.add(h.size());
            }
            else
            list.add(h.size());
        }
        return list;
    }
}
