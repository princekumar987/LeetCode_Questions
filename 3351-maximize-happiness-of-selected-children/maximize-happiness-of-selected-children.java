class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       
       long ans=0;
       Arrays.sort(happiness);
       int count=0;

       for(int i=happiness.length-1;i>=0;i--){
          if(happiness[i]-count>0){
            ans+=(happiness[i]-count);
            count++;
            if(count==k)break;
          }
          else break;
       }


       return ans;
    }
}