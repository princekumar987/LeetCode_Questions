class Solution {
    public long flowerGame(int n, int m) {
         
         long ans=0;

         for(long i=1;i<=n;i++){
               if(i%2==0){
                   if(m%2==0){
                     ans=ans+m/2;
                   }
                   else{
                     ans=ans+(m+1)/2;
                   }
               }
               else{
                  
                     ans+=m/2;
                  
               }
         }

         return ans;
    }
}