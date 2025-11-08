class Solution {
    public List<Integer> grayCode(int n) {
        int total=1<<n;
        List<Integer> ll =new ArrayList<>();
        for(int i =0;i<total;i++){
            ll.add(i^(i>>1));
        }
        return ll;
    }
}