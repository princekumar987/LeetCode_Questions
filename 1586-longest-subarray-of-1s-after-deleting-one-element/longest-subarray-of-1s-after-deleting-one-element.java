class Solution {
    public int longestSubarray(int[] nums) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();
        int j=0;
        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++){
            int x=nums[i];
            mp.put(x,mp.getOrDefault(x,0)+1);

            if(mp.containsKey(0)){
                int a=mp.get(0);
                if(a==1){
                    ans=Math.max(ans,i-j+1);
                }
                else{
                    mp.put(nums[j],mp.get(nums[j])-1);
                    if(mp.get(nums[j])==0){
                        mp.remove(nums[j]);
                    }
                    j++;
                }
            }
            else{
                ans=Math.max(ans,i-j+1);
            }
        }

        return ans-1;

    }
}