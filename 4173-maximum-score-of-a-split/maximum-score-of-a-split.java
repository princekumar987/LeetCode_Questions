class Solution {
    public long maximumScore(int[] nums) {
          
          long []arr=new long[nums.length];
          long min=Integer.MAX_VALUE;

          for(int i=nums.length-1;i>=0;i--){
              min=Math.min(min,nums[i]);
              arr[i]=min;
          }

          long ans=Integer.MIN_VALUE;
          long sum=0;
          long total=arr[nums.length-1];

          for(int i=0;i<nums.length-1;i++){
                sum+=nums[i];
                long c=sum-arr[i+1];
                ans=Math.max(c,ans);
          }

          return ans;

    }
}