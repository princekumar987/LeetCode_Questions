class Solution {
    public int minimumEffortPath(int[][] heights) {
           
           int m=heights.length;
           int n=heights[0].length;
           int [][]dis=new int[m][n];

           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                    dis[i][j]=(int)1e9;
               }
           }

           PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->a[0]-b[0]);
           q.add(new int[]{0,0,0});
           dis[0][0]=0;

           while(q.size()>0){

                 int []temp=q.peek();
                 int d=temp[0];
                 int r=temp[1];
                 int c=temp[2];
                 q.poll();

                 int []dr={-1,0,1,0};
                 int []dc={0,1,0,-1};

                 for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];

                    if(nr>=0 && nr<m && nc>=0 && nc<n){
                          int abs=Math.abs(heights[nr][nc]-heights[r][c]); 
                          int sdf=Math.max(abs,d);
                          if(sdf<dis[nr][nc]){
                              dis[nr][nc]=sdf;
                              q.add(new int[]{sdf,nr,nc});
                          }
                    }
                 }
           }

           return dis[m-1][n-1];
    }
}