class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
             count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]<nums[j])count++;
                else{
                    ans=Math.max(ans,count);
                    break;
                }
            }
            ans=Math.max(ans,count);
        }
         ans=Math.max(ans,count);

         for(int i=0;i<nums.length;i++){
             count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]>nums[j])count++;
                else{
                    ans=Math.max(ans,count);
                    break;
                }
            }
            ans=Math.max(ans,count);
        }
         ans=Math.max(ans,count);


        return ans;
    }
}