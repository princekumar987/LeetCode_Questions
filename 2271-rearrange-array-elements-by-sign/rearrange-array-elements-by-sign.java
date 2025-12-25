class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int pos=0;
        int neg=0;
        int []ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
                
                while(pos<nums.length){
                    if(nums[pos]>0)break;
                    pos++;
                }
                while(neg<nums.length){
                    if(nums[neg]<0)break;
                    neg++;
                }
                ans[i]=nums[pos];
                i++;
                ans[i]=nums[neg];
                pos++;
                neg++;
        }

        return ans;
    }
}