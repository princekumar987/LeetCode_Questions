class Solution {
    public String removeOuterParentheses(String s) {
         
         StringBuilder ans=new StringBuilder("");
         StringBuilder sb=new StringBuilder("");
         int count=0;

         for(int i=0;i<s.length();i++){
             
             if(s.charAt(i)=='('){
                 count++;
                 sb.append("(");
             }
             else if(s.charAt(i)==')'){
                 count--;
                 sb.append(")");
             }
             if(count==0){
                  ans.append(sb.substring(1,sb.length()-1));
                  sb=new StringBuilder("");
             }
         }

         return ans.toString();
    }
}