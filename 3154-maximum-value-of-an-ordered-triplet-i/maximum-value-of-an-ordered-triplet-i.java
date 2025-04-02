class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long a=nums[i];
                    long b=nums[j];
                    long c=nums[k];
                    long x=(a-b)*c;
                    ans=Math.max(x,ans);
                }
            }
        }
        if(ans<=0)return 0;
        else return ans;
    }
}