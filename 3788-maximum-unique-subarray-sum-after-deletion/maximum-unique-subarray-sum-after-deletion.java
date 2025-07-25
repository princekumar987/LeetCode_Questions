class Solution {
    public int maxSum(int[] nums) {
        
        int sum=0;

        int min=Integer.MIN_VALUE;
        HashSet<Integer>st=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]>0 && !st.contains(nums[i])){
                     sum=sum+nums[i];
                     st.add(nums[i]);
            }
            min=Math.max(min,nums[i]);
        }

        if(sum==0)return min;

        return sum;


    }
}