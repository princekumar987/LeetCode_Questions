class Solution {
    public int subarraySum(int[] nums, int k) {
         
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        int ans=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             int x=sum-k;
             if(mp.containsKey(x)){
                 ans+=mp.get(x);
             }

             if(mp.containsKey(sum)){
                  mp.put(sum,mp.get(sum)+1);
             }
             else{
                mp.put(sum,1);
             }
        }

        return ans;
    }
}