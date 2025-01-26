class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int n=nums.length;

        int []min=new int[n];
        int []max=new int[n];
        int m=Integer.MAX_VALUE;
    
        for(int i=1;i<nums.length;i++){
           m=Math.min(m,nums[i-1]);
           min[i]=m;
        }

        m=Integer.MIN_VALUE;

        for(int i=nums.length-2;i>=0;i--){
           m=Math.max(m,nums[i+1]);
           max[i]=m;
        }

        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>min[i] && nums[i]<max[i])return true;
        }

        return false;
       
       
    }
}