class Solution {

    int fun(int []arr, int idx, int []dp){
          
          if(idx>=arr.length)return 0;

          if(dp[idx]!=-1)return dp[idx];

          int pick=fun(arr,idx+1,dp);
          int nonpick=arr[idx]+fun(arr,idx+2,dp);

          return dp[idx]= Math.max(pick,nonpick);
    }
    public int rob(int[] nums) {
        
        int n=nums.length;
        int []dp=new int [n+1];
        Arrays.fill(dp,-1);
        return fun(nums,0,dp);
    }
}