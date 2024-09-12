class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer>ll=new ArrayList<>();
        for(int i =1;i<n;i++){
            fact*=i;
            ll.add(i);
        }
        ll.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+ll.get(k/fact);
            ll.remove(k/fact);
            if(ll.size()==0) break;
            k=k%fact;
            fact=fact/ll.size();
        }
        return ans;
    }
}