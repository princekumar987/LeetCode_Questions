class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
                i++;
            }
            i++;
        }
        i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=0){
               nums[j]=nums[i];
               j++;
            }
            i++;
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        
        return nums;
    }
}