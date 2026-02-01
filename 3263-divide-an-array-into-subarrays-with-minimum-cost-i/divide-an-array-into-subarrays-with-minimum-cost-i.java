class Solution {
    public int minimumCost(int[] nums) {

          int ans=nums[0];
          int a=51;
          int b=51;
          int idx=0;

          for(int i=1;i<nums.length;i++){
              if(nums[i]<a){
                  a=nums[i];
                  idx=i; 
              }
          }

          for(int i=1;i<nums.length;i++){
              if(nums[i]<b && i!=idx){
                  b=nums[i];
              }
          }

          return ans+a+b;

    }
}