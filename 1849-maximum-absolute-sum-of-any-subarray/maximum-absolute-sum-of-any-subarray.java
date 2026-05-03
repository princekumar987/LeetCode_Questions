class Solution {
    public int maxAbsoluteSum(int[] nums) {
          
          int ans=Integer.MIN_VALUE;
          int sum=0;
          for(int e:nums){
              sum+=e;
              ans=Math.max(ans,Math.abs(sum));
              if(sum<0)sum=0;
          }
          sum=0;
          for(int e:nums){
              sum+=e;
              ans=Math.max(ans,Math.abs(sum));
              if(sum>0)sum=0;
          }

          return ans;
    }
}