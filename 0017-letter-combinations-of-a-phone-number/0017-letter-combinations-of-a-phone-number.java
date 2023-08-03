class Solution {
    static String key[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> arr=new ArrayList<>();
        if(digits.length()==0){
            return arr;
        }
        keys(digits,"",arr);
        return arr;
    }
    public static void keys (String digits,String ans, List<String> arr){
        if(digits.length()==0){
            arr.add(ans);
            return;
        }
        int an=digits.charAt(0)-48;
        String at=key[an];
        for(int i=0;i<at.length();i++){
            keys(digits.substring(1),ans+at.charAt(i),arr);
        }
    }
}