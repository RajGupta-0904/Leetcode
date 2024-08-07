class Solution {
    public String numberToWords(int n) {
        if(n==0) return "Zero";
        // String [] term =new String[]{"Thousand","Million","Billion"};
        String ans=solve(n%1000);
        n=n/1000;
        if(n>0 && n%1000>0){
            ans =solve(n%1000) + "Thousand " +ans;
        }
        n=n/1000;
        if(n>0 && n%1000>0){
            ans =solve(n%1000) + "Million " +ans;
        }
        n=n/1000;
        if(n>0){
            ans =solve(n%1000) + "Billion " +ans;
        }
        return ans.trim();

    }
    public static String solve(int n ){
         String[] digitString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teenString = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
        String[] tenString = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String ans="";
        if(n>99){
            ans+=digitString[n/100] + " Hundred ";
        }
        n=n%100;
        if(n<20 && n>9){
            ans+=teenString[n%10] + " ";
        }
        else{
            if(n>19){
                ans+=tenString[n/10]+" ";
            }
            n=n%10;
            if(n>0){
                ans+=digitString[n]+" ";
            }
        }
        return ans ;
    }
}