import java .io.*;   
class Sum_Of_Subset
{ 
   static void subsetSums(int []arr, int l, int r, int sum ) 
    {  
        if (l > r) 
        { 
            System.out.print(sum + " "); 
            return; 
        } 
        subsetSums(arr, l + 1, r,  sum + arr[l]);
        subsetSums(arr, l + 1, r, sum); 
    }  
    public static void main (String[] args) 
    { 
        int []arr = {5, 4, 3}; 
        int n = arr.length;
        subsetSums(arr, 0, n - 1, 0); 
    } 
} 