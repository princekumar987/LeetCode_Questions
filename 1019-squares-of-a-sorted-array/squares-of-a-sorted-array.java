class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i=0;
        int j=nums.length-1;

        int []ans=new int[nums.length];
        int k=nums.length-1;

        while(i<=j){
             int x=Math.abs(nums[i]);
             int y=Math.abs(nums[j]);
             if(x<=y){
                ans[k--]=y*y;
                j--;
             }
             else{
                ans[k--]=x*x;
                i++;
             }
        }

        return ans;
    }
}