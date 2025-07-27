class Solution {
    public int countHillValley(int[] nums) {


         int ans=0;

        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
              for(int j=i+1;j<nums.length;j++){
                   if(nums[j]!=nums[i]){
                       if(nums[i]>nums[i-1] && nums[i]>nums[j]){
                              ans++;
                       }
                       else if(nums[i]<nums[i-1] && nums[i]<nums[j]){
                              ans++;
                       }
                       break;
                   }
              }
           }
        }


        return ans;
    }
}