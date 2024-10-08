class KthLargest {
 PriorityQueue<Integer>pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        
        for(int a:nums){
            pq.add(a);
        }
        this.k=k;
    }
    
    public int add(int val) {
        pq.add(val);
        // pqsize()>0
        while(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */