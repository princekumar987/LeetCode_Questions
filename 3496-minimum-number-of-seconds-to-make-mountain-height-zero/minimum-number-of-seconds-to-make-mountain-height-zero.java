class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        
       long low=0;
       long high=(long)1e18;
       long ans=0;

       while(low<=high){

           long mid=low+(high-low)/2;

           long sum=0;
           for(int i=0;i<workerTimes.length;i++){
              sum+=(long)(Math.sqrt((double)mid*2/workerTimes[i]+0.25)-0.5);
           } 

           if(sum>=mountainHeight){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }

       return ans;


    }
}