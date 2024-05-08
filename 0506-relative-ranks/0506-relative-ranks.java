class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int temp[]=score.clone();
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            map.put(temp[i],temp.length-i);
        }
        String ans[]=new String[temp.length];
        for(int i=0;i<temp.length;i++){
            int rank=map.get(score[i]);
            String rankstr=rank+"";
            if(rank==1){
                ans[i]="Gold Medal";
            }
            else if(rank==2){
                ans[i]="Silver Medal";
            }
            else if(rank==3){
                ans[i]="Bronze Medal";
            }
            else{
                ans[i]=rankstr;
            }
        }
        return ans;
    }
}