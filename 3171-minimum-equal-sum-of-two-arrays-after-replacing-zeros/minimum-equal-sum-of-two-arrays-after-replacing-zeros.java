class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        
        int zero1=0;
        int zero2=0;
        long sum1=0;
        long sum2=0;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0)zero1++;
            else sum1+=nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0)zero2++;
            else sum2+=nums2[i];
        }

        if(zero1>0 && zero2>0){
            return Math.max(sum1+zero1,sum2+zero2);
        }
        else if(zero1>0){
             long s=sum1+zero1;
             if(s<=sum2)return sum2;
             else return -1;
        }
        else if(zero2>0){
            long s=sum2+zero2;
            if(s<=sum1)return sum1;
            else{
                return -1;
            }
        }
        else{
            if(sum1==sum2)return sum1;
            else return -1;
        }
    }
}