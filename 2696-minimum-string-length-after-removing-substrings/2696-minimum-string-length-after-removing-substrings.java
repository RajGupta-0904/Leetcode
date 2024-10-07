class Solution {  
    public int minLength(String s) {  
        StringBuilder sb = new StringBuilder(s);  
        
        boolean found = true;  
        
        while (found) {  
            found = false;  
            int indexAB = sb.indexOf("AB");  
            if (indexAB != -1) {  
                sb.delete(indexAB, indexAB + 2);  
                found = true;  
            }  
            
            int indexCD = sb.indexOf("CD");  
            if (indexCD != -1) {  
                sb.delete(indexCD, indexCD + 2);  
                found = true;  
            }  
        }  
        
        return sb.length();  
    }  
}