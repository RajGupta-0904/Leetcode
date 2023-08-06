//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{    
    // static ArrayList<String> ll=new ArrayList<>();
    public ArrayList<String> permutation(String S)
    {   ArrayList<String> ll=new ArrayList<>();
        ll.clear();
        perm(S,"",ll);
        Collections.sort(ll);
        return ll;
    }
    static boolean perm(String str,String ans,ArrayList<String> ll){
        if(str.length()==0)  return ll.add(ans);
        for(int i=0;i<str.length();i++) perm(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i),ll); 
        return true;
    }
}
