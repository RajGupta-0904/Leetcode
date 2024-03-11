class Solution {
    public String customSortString(String order, String s) {
        // Hashmap<Character, Integer> hmOrder = new HashMap<>();
        HashMap<Character, Integer> hmS = new HashMap<>();
        StringBuilder sb = new StringBuilder();
       
        //freq for S
        for(int i = 0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            hmS.put(curr,hmS.getOrDefault(curr,0)+1);
        }
        for(int i = 0 ; i<order.length() ; i++){
            char curr = order.charAt(i);
            if(hmS.containsKey(curr)){
                //we can also use str.repeat(times) instead of while loop
                while(hmS.get(curr)>0){
                    sb.append(curr);
                    hmS.put(curr, hmS.get(curr)-1);
                }
            } 
        }
        for (Map.Entry<Character,Integer> entry : hmS.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            while(value>0){
                sb.append(key); value--;
            }
        }
        return sb.toString();
    }
}