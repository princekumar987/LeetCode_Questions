class Solution {
    public int minimumDistance(int[] nums) {

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        ans=Math.min(ans,((j-i)+(k-j)+(k-i)));
                    }
                }
            }
        }

        if(ans==Integer.MAX_VALUE)return -1;
        else return ans;
        
    }
}