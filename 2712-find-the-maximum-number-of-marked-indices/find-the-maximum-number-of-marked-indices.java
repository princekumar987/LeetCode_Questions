class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int j=(nums.length+1)/2;
        int ans=0;

        while(i<j && j<nums.length){
              
              if(2*nums[i]<=nums[j]){
                   ans+=2;
                   i++;
                   j++;
              }
              else{
                 j++;
              }
        }

        return ans;
    }
}