class Solution {
    public int countPartitions(int[] nums) {
        
        int ans=0;
        int presum=0;
        
        for(int i=0;i<nums.length;i++){
            presum=presum+nums[i];
        }
        
        int current=0;
        
        for(int i=0;i<nums.length-1;i++){
            current+=nums[i];
            presum=presum-nums[i];
            if(Math.abs(presum-current)%2==0)ans++;
        }
        
        
        return ans;
        
    }
}