class Solution {
    public long zeroFilledSubarray(int[] nums) {
        if(nums.length==1 && nums[0]==0)return 1;
        long count=1;
        long ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i]==nums[i+1]){
                count++;
                continue; 
            }
            else if(nums[i]==0 && count==1){
                ans++;
               continue;
            }
            else{
                if(count==1){
                    continue;
                }
                ans=ans+(count*(count+1))/2;
                count=1;
            }
        }
        if(nums[nums.length-1]==0 && count==1){
            ans++;
        }
        if(count>=2)
        ans=ans+(count*(count+1))/2;
        return ans;
    }
}