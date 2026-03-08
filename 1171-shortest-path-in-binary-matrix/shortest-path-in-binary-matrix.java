class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
             
          int n=grid.length;
          if(grid[0][0]==1 || grid[n-1][n-1]==1)return -1;
          int [][]dis=new int[n][n];
          
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                   dis[i][j]=(int)1e9;
              }
          }

          Queue<int[]>q=new LinkedList<>();
          q.add(new int[]{1,0,0});
          dis[0][0]=1;

          while(q.size()>0){
                
                int []temp=q.peek();
                int d=temp[0];
                int r=temp[1];
                int c=temp[2];
                q.poll();

                int []dr={0,1,0,-1,1,-1,1,-1};
                int []dc={1,0,-1,0,1,-1,-1,1};
                for(int i=0;i<8;i++){
                      int nr=r+dr[i];
                      int nc=c+dc[i];
                      if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0){
                            if(1+d<dis[nr][nc]){
                                dis[nr][nc]=1+d;
                                q.add(new int[]{1+d,nr,nc});
                            }
                      }
                }
          }

          if(dis[n-1][n-1]!=(int)1e9)return dis[n-1][n-1];
          return -1;

    }
}