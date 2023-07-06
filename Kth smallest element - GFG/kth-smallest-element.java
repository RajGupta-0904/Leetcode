//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        HashSet<Integer> hs=new HashSet<>();
       for(int x:arr){
           hs.add(x);
       }
       
       int i=0;
      int arr2[]=new int[hs.size()];
      for(int x:hs) {
      arr2[i]=x;
      i++;
      }
      Arrays.sort(arr2);
       if(arr2.length==1){
           return -1;
       }else{
       return arr2[k-1];
    }
    } 
}
