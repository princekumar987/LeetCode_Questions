class Solution {
    public int minDeletions(int[] nums) {
          
          int current=nums[0];
          int ans=1;

          for(int i=0;i<nums.length;i++){
               if(nums[i]!=current){
                   ans++;
                   current=nums[i];
               }
          }

          return nums.length-ans;
    }
}