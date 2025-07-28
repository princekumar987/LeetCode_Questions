class Solution {

    public static int fun(int target,int index,int []nums,int current){

        if(index==nums.length){

            if(current==target)return 1;
            return 0;

        }

        int pick=fun(target,index+1,nums,current|nums[index]);

        int notpick=fun(target,index+1,nums,current);

        return pick+notpick;
    }
    
    public int countMaxOrSubsets(int[] nums) {
        
        int target=0;

        for(int i=0;i<nums.length;i++){
            target=target|nums[i];
        }

        int current=0;
        int index=0;

        return fun(target,index,nums,current);
    }
}