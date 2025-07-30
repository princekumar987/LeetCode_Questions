class Solution {
    public int longestSubarray(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int c = 0;
        int ans = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max)
                c++;
            else {
                ans = Math.max(ans, c);
                c=0;
            }
        }

        ans=Math.max(ans,c);

        return ans;

    }
}