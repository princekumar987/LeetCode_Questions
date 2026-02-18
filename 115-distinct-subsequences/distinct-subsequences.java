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
          
          int [][]dp=new int[s.length()][t.length()];
          for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                      dp[i][j]=-1;
                }
          }
          
          return fun(s.length()-1,t.length()-1,s,t,dp);
    }
}