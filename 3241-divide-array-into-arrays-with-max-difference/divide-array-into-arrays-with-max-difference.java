class Solution {
    public int[][] divideArray(int[] nums, int k) {
        

        Arrays.sort(nums);

        int p=nums.length/3;

        int [][]ans=new int[p][3];
        
        int j=0;
        for(int i=0;i<nums.length;i=i+3){
            ans[j][0]=nums[i];
            ans[j][1]=nums[i+1];
            ans[j][2]=nums[i+2];
            if(nums[i+2]-nums[i]>k)return new int[0][0];
            j++;
        }

        return ans;


    }
}