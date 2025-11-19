class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer>ans=new ArrayList<>();
        int min=101;
        int max=0;

        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }

        for(int i=min+1;i<max;i++){
            boolean p=false;
             for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    p=true;
                    break;
                }
             }
             if(!p){
                ans.add(i);
             }
        }

        return ans;
    }
}