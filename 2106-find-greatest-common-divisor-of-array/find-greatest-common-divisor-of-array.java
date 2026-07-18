class Solution {

    int gcd(int a, int b){
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    
    public int findGCD(int[] nums) {
           
           int min=10000;
           int max=0;

           for(int e:nums){
              min=Math.min(e,min);
              max=Math.max(e,max);
           }

           return gcd(min,max);
    }
}