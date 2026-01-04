class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int j=0;
        int zero=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
             if(nums[i]==0)zero++;
             if(zero<=k){
                   ans=Math.max(ans,i-j+1); 
             }
             else{
                 
                 while(j<i){
                     if(nums[j]==0){
                        zero--;
                        j++;
                        break;
                     }
                     j++;
                 }
             }
        }

        return ans;
    }
}