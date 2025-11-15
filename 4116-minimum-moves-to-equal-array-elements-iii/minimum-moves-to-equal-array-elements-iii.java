class Solution {
    public int minMoves(int[] nums) {
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=max-nums[i];
        }

        return ans;
    }
}