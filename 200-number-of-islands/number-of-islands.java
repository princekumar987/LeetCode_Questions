class Solution {


    void dfs(int row, int col, char [][]grid, int [][]vis){
           
           vis[row][col]=1;

           int []r={1,0,-1,0};
           int []c={0,1,0,-1};
           for(int i=0;i<4;i++){
               int nr=row+r[i];
               int nc=col+c[i];
               if((nr>=0 && nr<grid.length) && (nc>=0 && nc<grid[0].length) && grid[nr][nc]=='1' && vis[nr][nc]==0){
                   dfs(nr,nc,grid,vis);
               }
           }
    }


    public int numIslands(char[][] grid) {
           
           int m=grid.length;
           int n=grid[0].length;

           int [][]vis=new int[m][n];
           int ans=0;

           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                    
                    if(grid[i][j]=='1' && vis[i][j]==0){
                         ans++;
                         dfs(i,j,grid,vis);
                    }
               }
           }

           return ans;

    }
}