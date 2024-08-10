class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n =isConnected.length;
        HashMap<Integer,HashMap<Integer,Integer>>map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(isConnected[i][j]==1){
                    map.get(i).put(j,i);
                }
            }
        }
        LinkedList<Integer> q=new LinkedList<>();
        HashSet<Integer>hs=new HashSet<>();
        int cnt=0;
        for(int src:map.keySet()){
            if(hs.contains(src)){
                continue;
            }
            cnt++;
            q.add(src);
            while(!q.isEmpty()){
                int r=q.remove();
                 if(hs.contains(r)){
                    continue;
                 }
                hs.add(r);
                for(int nbrs:map.get(r).keySet()){
                    if(!hs.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return cnt;
    }
}