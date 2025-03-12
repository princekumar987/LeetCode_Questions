class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
            else if(nums[i]<0){
                count1++;
            }
        }
        if(count>count1){
            return count;
        }
        else{
            return count1;
        }
    }
}