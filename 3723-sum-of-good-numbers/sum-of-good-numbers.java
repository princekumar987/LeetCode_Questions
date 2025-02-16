class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        
        int ans=0;

        for(int i=0;i<nums.length;i++){
                boolean p=true;
                int a=i-k;
                int b=i+k;
                if(a>=0){
                    if(nums[a]>=nums[i])p=false;
                }
                if(b<nums.length){
                    if(nums[b]>=nums[i])p=false;
                }
                if(p){
                    ans=ans+nums[i];
                }
        }

        return ans;
    }
}