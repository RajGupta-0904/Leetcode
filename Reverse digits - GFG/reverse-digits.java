//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long reverse_digit(long x)
    {
        // Code here
        long  sum=0;
        long r;
        // int a=Integer.MAX_VALUE;
        //  int b=Integer.MIN_VALUE;
        
        while(x!=0){
            // if(sum>a/10||sum<b/10)
                // return 0;
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        return sum;
    }
}