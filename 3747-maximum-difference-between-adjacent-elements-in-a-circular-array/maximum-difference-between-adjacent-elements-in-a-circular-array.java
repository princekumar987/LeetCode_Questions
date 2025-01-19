class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int ans=0;

        for(int i=0;i<nums.length-1;i++){
            int x=Math.abs(nums[i]-nums[i+1]);
            ans=Math.max(ans,x);
        }

        ans=Math.max(ans,Math.abs(nums[0]-nums[nums.length-1]));

        return ans;
    }
}