class Solution {
    public List<List<String>> partition(String s) {
         List<String> arr = new ArrayList<>();
        List<List<String>> brr = new ArrayList<>();
        solve(s,arr,brr);
        return brr;
    }
    public static void solve(String ques,List<String> arr,List<List<String>> brr){
        if(ques.length()==0){
            brr.add(new ArrayList<>(arr));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String part=ques.substring(0,i);
            if(ispalindrome(part)){
                arr.add(part);
                solve(ques.substring(i),arr,brr);
                arr.remove(arr.size()-1);
            }    
        }
    }
    public static boolean ispalindrome(String part){
        int i=0,j=part.length()-1;
        while(i<j){
            if(part.charAt(i)!=part.charAt(j))
                return false;
            i++;
            j--;
        }
    return true;
    }
    
}