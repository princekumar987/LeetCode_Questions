class Solution {

    StringBuilder sb;

    boolean fun(StringBuilder sb, HashSet<String>st, int n){
           if(sb.length()==n){
               if(!st.contains(sb.toString())){
                   return true;
               }
               return false;
           }

           for(char ch='0';ch<='1';ch++){
               sb.append(ch);
               if(fun(sb,st,n))return true;
               sb.deleteCharAt(sb.length()-1);
           }

           return false;
    }
    public String findDifferentBinaryString(String[] nums) {
            
            HashSet<String>st=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                st.add(nums[i]);
            }
            sb=new StringBuilder("");

            fun(sb,st,nums[0].length());

            return sb.toString();
    }
}