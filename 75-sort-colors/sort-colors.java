class Solution {

   
    public void sortColors(int[] nums) {
        int one=0;
        int zero=0;
        int two=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;
            else if(nums[i]==1)one++;
            else two++;
        }


        int i=0;

        while(i<nums.length){
             if(i<zero)nums[i]=0;
             else if(i<one+zero)nums[i]=1;
             else nums[i]=2;
             i++;
        }

    }
}