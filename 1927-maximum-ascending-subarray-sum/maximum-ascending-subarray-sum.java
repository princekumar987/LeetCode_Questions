class Solution {
    public int maxAscendingSum(int[] nums) {
       int max=nums[0];
       int n=nums.length;
       int sum=nums[0];
       for(int i=1;i<n;i++){
           max=Math.max(max,sum);
           if(nums[i]>nums[i-1]){
               sum=sum+nums[i];
           }
           else{
               sum=nums[i];
           }
       }
       max=Math.max(max,sum);
       return max;

    }
}