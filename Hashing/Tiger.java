/*
 * Rohan is downloading the movie Tiger Zinda Hai using a torrent website, 
 * but he is new to torrent, 
 * so he doesn't know the difference between a fake download button and a real download button; 
 * therefore, he keeps pressing every button in excitement.
 * Now he has clicked N  buttons, and many tabs are opened, if an opened tab is clicked again then it closes it. 
 * Your task is to tell how many tabs are open at the end.
 */
import java.util.*;
class Tiger
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        str[i]=sc.nextLine();
        int res=count_tabs(str,n);
        System.out.println(res);
    }
    static int count_tabs (String arr[], int n)
    {
        HashSet<String> h=new HashSet<String>();
        for(int i=0;i<n;i++)
        {
            if(arr[i].equalsIgnoreCase("END"))
            h.clear();
            else if(h.contains(arr[i]))
            h.remove(arr[i]);
            else
            h.add(arr[i]);
        }
        return h.size();
    }
}