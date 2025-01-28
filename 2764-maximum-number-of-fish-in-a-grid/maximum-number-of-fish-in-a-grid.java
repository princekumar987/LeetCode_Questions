class Solution {

    public static int dfs(int i,int j, int [][]grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 ){
            return 0;
        }

        int ans=grid[i][j];
        grid[i][j]=0;
        ans=ans+dfs(i+1,j,grid)+dfs(i-1,j,grid)+dfs(i,j+1,grid)+dfs(i,j-1,grid);

        return ans;
    }
    public int findMaxFish(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                     ans=Math.max(ans,dfs(i,j,grid));
                }
            }
        }

        return ans;
    }
}