class Solution {
    public int maxProduct(int[] nums) {
       
      
       int ans=Integer.MIN_VALUE;
       int prefix=1;
       boolean p=false;

       for(int i=0;i<nums.length;i++){
              if(nums[i]==0){
                prefix=1;
                p=true;
                continue;
              }
              prefix=prefix*nums[i];
              ans=Math.max(ans,prefix);
       }

       int suffix=1;

        for(int i=nums.length-1;i>=0;i--){
              if(nums[i]==0){
                suffix=1;
                p=true;
                continue;
              }
              suffix=suffix*nums[i];
              ans=Math.max(ans,suffix);
       }
       
       if(ans<0 && p)  return 0;
       return ans;
    
    }
}