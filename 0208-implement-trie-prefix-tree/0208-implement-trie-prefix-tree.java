class Trie {
    public class Node{
        char data;
        boolean isTerminal;
        HashMap<Character,Node> child=new HashMap<>();
    }
    public Trie() {
        Node nn=new Node();
        nn.data='*';
        root=nn;
        
    }
    private Node root;
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }else{
                Node mn=new Node();
                mn.data=ch;
                curr.child.put(ch,mn);
                curr=mn;
            }
        }
        curr.isTerminal=true;
        
    }
    
    public boolean search(String word) {
                Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }else{
               return false;
            }
        }
        return curr.isTerminal;
    }
    
    public boolean startsWith(String word) {
         Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }else{
               return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */