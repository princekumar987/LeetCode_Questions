class Solution {
    public List<Integer> findValidElements(int[] nums) {

        

        List<Integer>ans=new ArrayList<>();

        if(nums.length<=2){
            for(int e:nums){
                ans.add(e);
            }
            return ans;
        }
        int []lmax=new int[nums.length];
        int []rmax=new int[nums.length];
        int max=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            lmax[i]=max;
            //System.out.println(max);
        }
        max=0;

        for(int i=nums.length-1;i>=0;i--){
            max=Math.max(max,nums[i]);
            rmax[i]=max;
            //System.out.println(max);
        }

        ans.add(nums[0]);

        for(int i=1;i<nums.length-1;i++){

            if(lmax[i]>lmax[i-1] || rmax[i]>rmax[i+1])ans.add(nums[i]);
        }
        ans.add(nums[nums.length-1]);

        return ans;
    }
}