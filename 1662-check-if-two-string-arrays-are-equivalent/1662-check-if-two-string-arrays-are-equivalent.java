class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for(String a:word1){
            w.append(a);
        }
        for(String b:word2){
            w2.append(b);
        }
         String s1=w.toString();
        String s2=w2.toString();
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
        
    }
}
