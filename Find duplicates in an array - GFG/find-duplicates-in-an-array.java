//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int nums[], int n) {
        // code here
         ArrayList<Integer> ll=new ArrayList<>();
         int arr[]=new int [100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]==2){
                ll.add(nums[i]);
            }
        }
        if(ll.size()==0){
            ll.add(-1);
        }
        Collections.sort(ll);
        return ll;
    }
}
