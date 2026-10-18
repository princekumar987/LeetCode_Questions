class Solution {
    public int[] lastVisitedCell(char[][] grid) {
          
          int m=grid.length;
          int n=grid[0].length;
          int [][]vis=new int[m][n];

          int i=0;
          int j=0;
          vis[i][j]=1;

          while(true){
                char ch=grid[i][j];
                if(ch=='L'){
                      if(j-1>=0 && vis[i][j-1]==0){
                           vis[i][j-1]=1;
                           j--;   
                      }
                      else break;
                }
                else if(ch=='R'){
                      if(j+1<n && vis[i][j+1]==0){
                           vis[i][j+1]=1;
                           j++;
                      }
                      else break;
                }
                else if(ch=='U'){
                      if(i-1>=0 && vis[i-1][j]==0){
                           vis[i-1][j]=1;
                           i--;
                      }
                      else break;
                }
                else{
                       if(i+1<m && vis[i+1][j]==0){
                            vis[i+1][j]=1;
                            i++;
                       }
                       else break;
                }
          }


          return new int[]{i,j};

    }
}