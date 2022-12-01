//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       if(m==0 || n==0){
           return 0;
       }
       if(n<m){
           return -1;
       }
       Collections.sort(a);
       int min = a.get(a.size()-1);
       int minUpto;
      for(int i = 0;i + m - 1 < n;i++){
          minUpto=a.get(i+m-1)-a.get(i);
          if(minUpto<min){
              min=minUpto;
          }
          
      }
       return min;
    }
}