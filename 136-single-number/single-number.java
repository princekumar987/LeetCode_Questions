class Solution {
    public int singleNumber(int[] nums) {
        
        int ans=0;

        for(int e:nums){
            ans=ans^e;
        }

        return ans;
    }
}