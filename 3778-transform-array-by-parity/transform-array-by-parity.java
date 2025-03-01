class Solution {
    public int[] transformArray(int[] nums) {
        
        int even=0;
        int odd=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        int j=0;

        while(even>0){
            nums[j]=0;
            even--;
            j++;
        }

        while(odd>0){
            nums[j]=1;
            odd--;
            j++;
        }

        return nums;
    }
}