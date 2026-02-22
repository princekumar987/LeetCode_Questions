class Solution {

    int fun(int i, int j, List<Integer>list, int [][]dp){
          
          if(i>j)return 0;

          if(dp[i][j]!=-1)return dp[i][j];
          
          int ans=(int)(1e9);
          for(int k=i;k<=j;k++){
              int temp=(list.get(j+1)-list.get(i-1))+fun(i,k-1,list,dp)+fun(k+1,j,list,dp);
              if(ans>temp){
                 ans=temp;
              }
          }

          return dp[i][j]=ans;
    }
    public int minCost(int n, int[] cuts) {
          
          Arrays.sort(cuts);
          List<Integer>list=new ArrayList<>();
          list.add(0);
          for(int e:cuts)list.add(e);
          list.add(n);

          int [][]dp=new int[list.size()][list.size()];
          for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
          }

          return fun(1,list.size()-2,list,dp);
    }
}