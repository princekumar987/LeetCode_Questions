class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        HashSet<Integer>st=new HashSet<>();
        for(int i=1;i<nums.length-1;i++){
            st.add(nums[i]);
        }
        List<Integer>ans=new ArrayList<>();

        for(int j=min+1;j<max;j++){
            if(!st.contains(j))ans.add(j);
        }

        return ans;
    }
}