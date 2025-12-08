class Solution {
    public int missingNumber(int[] nums) {
       
       int sum=0;

       for(int e:nums){
          sum+=e;
       }

       int totalsum=(nums.length*(nums.length+1))/2;

       return totalsum-sum;
    }
}