class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int a=0;
        int b=0;
        int c=name.length();
        int d=typed.length();
        while(a<c && b<d){
            if(name.charAt(a)==typed.charAt(b)){
                a++;
                b++;
            }
            else if(b>0 && typed.charAt(b)==typed.charAt(b-1)){
                b++;
            }
            else{
                return false;
            }
        }
        if(a<c){
            return false;
        }
        while(b<d){
            if(typed.charAt(b)==name.charAt(a-1)){
                b++;
            }else{
                return false;
            }
        }
        return true;
    }
}