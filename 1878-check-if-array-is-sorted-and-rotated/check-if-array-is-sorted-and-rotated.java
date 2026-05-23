class Solution {
    public boolean check(int[] nums) {

            if(nums.length==1 || nums.length==2)return true;
            
            int breakPoints=-1;

            for(int i=0;i<nums.length-1;i++){
                  if(nums[i]>nums[i+1]){
                    breakPoints=i+1;
                    break;
                  }
            }

            if(breakPoints==nums.length-1 && nums[breakPoints]<=nums[0])return true;
            if(breakPoints==-1)return true;

            for(int i=breakPoints;i<nums.length-1;i++){
                 if(nums[i]>nums[i+1])return false;
            }

            if(nums[0]>=nums[nums.length-1])return true;
            return false;

    }
}