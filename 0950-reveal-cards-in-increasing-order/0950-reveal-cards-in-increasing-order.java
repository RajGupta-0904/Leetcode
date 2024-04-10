class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
            Queue<Integer>q=new LinkedList<>();
            for(int i=0;i<deck.length;i++){
                q.add(i);
            }
            // add index in the queue
            int ans[]=new int [deck.length];
            for(int i=0;i<deck.length;i++){
                ans[q.poll()]=deck[i];
                if(q.size()>0){
                    q.add(q.poll());
                }
            }
            return ans;
    }
}