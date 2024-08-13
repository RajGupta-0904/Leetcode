class Solution {
    class Node{
        int row;
        int col;
        int d;
        Node(int row,int col,int d ){
            this.row=row;
            this.col=col;
            this.d=d;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m =mat[0].length;
        int vis[][]=new int [n][m];
        int dis[][]=new int [n][m];
        Queue<Node>q=new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    q.add(new Node(i,j,0));
                }else{
                    vis[i][j]=0;
                }
            }
        }
        int rows[]={-1,0,1,0};
        int cols[]={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int d=q.peek().d;
            q.remove();
            dis[r][c]=d;
            for(int i =0;i<4;i++){
                int nrow=r+rows[i];
                int ncol=c+cols[i];
                if(nrow>=0 && nrow< n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                    q.add(new Node(nrow,ncol,d+1));
                    vis[nrow][ncol]=1;
                
                }
            }
        }
        return dis;
    }
}