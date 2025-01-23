class Solution {
    public int countServers(int[][] grid) {
        
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;

        int []row=new int[m];
        int []col=new int[n];

        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)c++;
            }
            row[i]=c;
        }
        for(int j=0;j<n;j++){
            int c=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==1)c++;
            }
            col[j]=c;
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   if(row[i]>1)ans++;
                   else if(col[j]>1)ans++; 
                }
            }
        }

        return ans;
    }
}