class Solution {
    public long maximumTripletValue(int[] nums) {
        
        
        int []pmax=new int[nums.length];
        int []smax=new int[nums.length];
        int max=0;

        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i-1],max);
            pmax[i]=max;
        }

        max=0;

        for(int j=nums.length-2;j>=0;j--){
            max=Math.max(nums[j+1],max);
            smax[j]=max;
        }

        long ans=0;

        for(int i=0;i<nums.length;i++){

           if(i==nums.length-1)continue;
           
           long a=nums[i];
           long b=pmax[i];
           long c=smax[i];

           long d=(b-a)*c;

           ans=Math.max(ans,d);
        }

        return ans;


    }
}