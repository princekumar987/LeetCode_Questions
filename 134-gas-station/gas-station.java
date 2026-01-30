class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         

         int gastotal=0;
         int costtotal=0;
         for(int i=0;i<gas.length;i++){
            gastotal+=gas[i];
            costtotal+=cost[i];
         }

         if(costtotal>gastotal)return -1;

         boolean p=false;
         int ans=-1;
         int sum=0;
         for(int i=0;i<gas.length;i++){

             sum+=(gas[i]-cost[i]);
             if(sum<0){
                 p=false;
                 sum=0;
             }
             else{
                 if(p==false){
                    ans=i;
                    p=true;
                 }
             }
         }

         if(p)return ans;
         return -1;
       
    }
}