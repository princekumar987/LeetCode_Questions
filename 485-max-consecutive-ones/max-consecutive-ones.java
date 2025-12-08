class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ans=0;

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)count++;
            else{
                ans=Math.max(count,ans);
                count=0;
            }
        }
        ans=Math.max(count,ans);

        return ans;
    }
}