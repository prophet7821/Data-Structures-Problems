/*
 * Given an integer n. Print first n elements of Recaman’s sequence.
 */
import java.util.*;
class Recaman_Seq
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of sequence codes to print");
        int n=sc.nextInt();
        System.out.println(recamanSequence(n));
    }
    static ArrayList<Integer> recamanSequence(int n){
        int a=0,k=1;
        HashSet<Integer>h=new HashSet<Integer>();
        ArrayList <Integer> list=new ArrayList<Integer>();
        list.add(0);
        h.add(0);
        while(n>1)
        {
            if(h.contains(a-k)==false&&a-k>0)
            {
                a-=k;
                h.add(a);
                list.add(a);
            }
            else
            {
                a+=k;
                h.add(a);
                list.add(a);
            }
            ++k;
            --n;
        }
        return list;
    }
}
