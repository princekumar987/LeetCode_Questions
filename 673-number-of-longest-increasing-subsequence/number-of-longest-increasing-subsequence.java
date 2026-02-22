class Solution {
    public int findNumberOfLIS(int[] nums) {
          
          int []dp=new int[nums.length];
          int []count=new int [nums.length];
          Arrays.fill(count,1);
          Arrays.fill(dp,1);
          int max=0;

          for(int i=0;i<nums.length;i++){
              for(int j=0;j<i;j++){
                   if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                       dp[i]=dp[j]+1;
                       count[i]=count[j];
                   }
                   else if(nums[i]>nums[j] && dp[j]+1==dp[i]){
                       count[i]+=count[j];
                   }
              }
              max=Math.max(max,dp[i]);
          }
          
          int ans=0;
         for(int i=0;i<nums.length;i++){
              if(dp[i]==max)ans+=count[i];
         }
          return ans;
    }
}