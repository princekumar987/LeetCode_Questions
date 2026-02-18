class Solution {

    int fun(int idx1,int idx2,String s,String t,int [][]dp){
          
          if(idx2<0)return 1;
          if(idx1<0)return 0;
          
          if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
          int a=0;
          if(s.charAt(idx1)==t.charAt(idx2)){
             a=fun(idx1-1,idx2-1,s,t,dp);
          } 
          int b=fun(idx1-1,idx2,s,t,dp);

          return dp[idx1][idx2]=a+b;
    }
    public int numDistinct(String s, String t) {
          
          int [][]dp=new int[s.length()+1][t.length()+1];
          for(int i=0;i<dp.length;i++){
              dp[i][0]=1;
          }
          
          for(int i=1;i<dp.length;i++){
              for(int j=1;j<dp[0].length;j++){
                     int a=0;
                     if(s.charAt(i-1)==t.charAt(j-1)){
                        a=dp[i-1][j-1];
                     }
                     int b=dp[i-1][j];
                     dp[i][j]=a+b;
              }
          }

          return dp[dp.length-1][dp[0].length-1];
    }
}