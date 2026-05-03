class Solution {
    public String truncateSentence(String s, int k) {
           
           String[]str=s.split(" ");
           StringBuilder sb=new StringBuilder(""); 
           for(int i=0;i<k;i++){
               sb.append(str[i]+" ");
           }

           return sb.toString().trim();
    }
}