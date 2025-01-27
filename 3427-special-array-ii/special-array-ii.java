class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        
        int n=nums.length;
        int []presum=new int[n];
        int c=0;  

        for(int i=1;i<n;i++){
          if(nums[i]%2==nums[i-1]%2){
             c++;
          }
          presum[i]=c;
        }

        boolean []ans=new boolean [queries.length];

        for(int i=0;i<queries.length;i++){

            int l=queries[i][0];
            int r=queries[i][1];
            int s=presum[r]-presum[l];
            if(s==0){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }

        return ans;
    }
}