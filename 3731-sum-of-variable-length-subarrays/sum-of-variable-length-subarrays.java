class Solution {
    public int subarraySum(int[] nums) {

        int ans=0;

        for(int i=0;i<nums.length;i++){
            int x=Math.max(0,i-nums[i]);
            int sum=0;
            for(int j=x;j<=i;j++){
                sum=sum+nums[j];
            }
            ans=ans+sum;
        }

        return ans;

    }
}