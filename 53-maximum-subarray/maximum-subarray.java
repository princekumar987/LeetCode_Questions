class Solution {
    public int maxSubArray(int[] nums) {

      int ans=Integer.MIN_VALUE;
      int sum=0;

      for(int e:nums){
          sum+=e;
          ans=Math.max(sum,ans);
          if(sum<0)sum=0;
      }

      return ans;
      
        
    }
}