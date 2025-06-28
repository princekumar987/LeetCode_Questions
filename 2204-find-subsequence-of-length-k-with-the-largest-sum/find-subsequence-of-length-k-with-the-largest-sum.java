class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n=nums.length;

        int []ans=new int[k];
        HashMap<Integer,Integer>mp=new HashMap<>();
        int []p=nums.clone();
        Arrays.sort(p);
        for(int i=n-k;i<n;i++){
            int x=p[i];
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        int j=0;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(mp.containsKey(nums[i])){
                mp.put(x,mp.get(x)-1);
                if(mp.get(x)==0){
                    mp.remove(x);
                }
                ans[j]=nums[i];
                j++;
            }
            if(j==k)break;
        }

        return ans;
    }
}