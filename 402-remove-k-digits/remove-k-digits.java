class Solution {
    public String removeKdigits(String num, int k) {
           
           StringBuilder sb=new StringBuilder("");
           Stack<Character>st=new Stack<>();

           for(int i=0;i<num.length();i++){
                char ch=num.charAt(i);
                while(k>0 && st.size()>0 && st.peek()>ch){
                      st.pop();
                      k--;
                }
                if(ch=='0'){
                    if(st.size()>0)st.push(ch);
                }
                else{
                    st.push(ch);
                }
           }

           while(st.size()>0 && k-->0)st.pop();

           while(st.size()>0){
               sb.append(st.pop());
           }

           if(sb.length()==0)return "0";

           return sb.reverse().toString();
    }
}