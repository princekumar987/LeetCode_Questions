class Solution {
    public int compareBitonicSums(int[] nums) {

        int n=nums.length;
        if(nums[1]<nums[0])return 1;
        if(nums[n-1]>nums[n-2])return 0;
        
        long lsum=nums[0];
        int p=0;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                 lsum=lsum+nums[i];
            }
            else{
                p=i-1;
                break;
            }
        }

        long rsum=nums[p];

        for(int i=p+1;i<n;i++){
            rsum+=nums[i];
        }

        if(lsum>rsum)return 0;
        else if(rsum>lsum)return 1;
        else return -1;
    }
}