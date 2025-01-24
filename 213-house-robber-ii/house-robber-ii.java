class Solution {

    public  static int fun(int []nums,int index,int []dp,int n){
        if(index==n-1){
            return nums[index];
        }
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index]+fun(nums,index+2,dp,n);
        int not_pick=fun(nums,index+1,dp,n); 

        return dp[index]=Math.max(pick,not_pick);
    }

    public int rob(int[] nums) {

        
        int n=nums.length;

        if(n==1)return nums[0];

        int dp []=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
       int ans1= fun(nums,0,dp,n-1);
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
       int ans2= fun(nums,1,dp,n);

       return Math.max(ans1,ans2);
    }
}