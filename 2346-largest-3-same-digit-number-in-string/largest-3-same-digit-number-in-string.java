class Solution {
    public String largestGoodInteger(String nums) {
       
       int i=0;
       String ans="";

       while(i<10){
           String s=""+i+i+i;
           if(nums.contains(s)){
               ans=s;
           } 
           i++;
       }

       return ans;


    }
}