class Solution {
    public int finalElement(int[] nums) {

       if(nums.length==1) return nums[0] ;
       return Math.max(nums[0],nums[nums.length-1]);

         
    }
}