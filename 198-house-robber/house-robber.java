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
        dp[0]=nums[0];
        int pick=0;
        int nonpick=0;
        for(int i=1;i<n;i++){

           
            pick=nums[i];
            if(i>=2)pick+=dp[i-2];
            nonpick=dp[i-1];        
            dp[i]=Math.max(pick,nonpick);      
        }

        return dp[n-1];
    }
}