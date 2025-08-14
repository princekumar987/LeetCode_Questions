class Solution {
    public String largestGoodInteger(String nums) {
       
       int max=-1;
       for(int i=0;i<nums.length()-2;i++){
          
          if(nums.charAt(i)==nums.charAt(i+1) && nums.charAt(i)==nums.charAt(i+2)){
               int x=Integer.parseInt(""+nums.charAt(i)+nums.charAt(i+1)+nums.charAt(i+2));
               max=Math.max(max,x);
          }
       }

       if(max!=-1){
           if(max==0)return "000";
           else return String.valueOf(max);
       }
       else return "";



    }
}