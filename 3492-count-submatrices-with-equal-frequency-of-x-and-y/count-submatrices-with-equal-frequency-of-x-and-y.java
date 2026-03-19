class Solution {
    public int numberOfSubmatrices(char[][] grid) {
          
          int m=grid.length;
          int n=grid[0].length;

          int []a=new int[n];
          boolean []b=new boolean[n];
          int ans=0;

          for(int i=0;i<m;i++){
              int sum=0;
              boolean p=false;
              for(int j=0;j<n;j++){
                  int c=0;
                  if(grid[i][j]=='X'){
                     c=1;
                     p=true;
                  }
                  if(grid[i][j]=='Y')c=-1;
                  if(p)b[j]=true;
                  sum+=c;
                  if(i==0){
                     a[j]=sum;
                  }
                  else{
                     a[j]=sum+a[j];
                  }
                  if(a[j]==0 && (b[j] || p))ans++;
              }
          }

          return ans;


    }
}