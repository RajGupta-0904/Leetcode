class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ll=new ArrayList<>();
        solve(n,0,0,"",ll);
            return ll;
    }
    public static void solve(int n,int o,int c,String ans,ArrayList<String>ll){
        if(o==n && c==n){
            ll.add(ans);
            return ;
        }
        
        if(o<n){
            solve(n,o+1,c,ans+"(",ll);
        }
        if(c<o){
            solve(n,o,c+1,ans+")",ll);
        }
    }
}