class Solution {
    public int sumFourDivisors(int[] nums) {
       
       int ans=0;
       for(int i=0;i<nums.length;i++){
             int x=nums[i];
             int count=0;
             int a=0;
             for(int j=2;j<=Math.sqrt(x);j++){
                  if(x%j==0){
                    count++;
                    a=j;
                  }   
             }

             if(count==1 && a!=(x/a)){
                   ans=ans+(1+x+(a+ (x/a)));
             }
       }

       return ans;
    }
}