class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num= new StringBuilder();
        for(char a:s.toCharArray()){
            num.append(a-'a'+1);
        }
        while(k-->0){
            int temp=0;
            for(char a:num.toString().toCharArray()){
                temp+=a-'0';
            }
            num=new StringBuilder(String.valueOf(temp));
        }
        return Integer.parseInt(num.toString());
    }
}