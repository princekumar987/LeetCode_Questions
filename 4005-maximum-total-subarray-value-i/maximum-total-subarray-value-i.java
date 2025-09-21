class Solution {
    public long maxTotalValue(int[] nums, int k) {
          
          long max=0;
          long min=Integer.MAX_VALUE;

          for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
          }

          return (max-min)*k;
    }
}