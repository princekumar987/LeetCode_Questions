class Solution {
    public int minOperations(int[] nums) {
           
         Arrays.sort(nums);

         if(nums[0]==nums[nums.length-1])return 0;
         else return 1;

    }
}