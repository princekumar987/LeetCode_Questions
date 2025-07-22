class Solution {
    public boolean isValid(String s) {
       
       Stack<Character>st=new Stack<>();
       
       int i=0;

       while(i<s.length()){
            
            char ch=s.charAt(i);

            if(st.size()==0){
                st.push(ch);
            }
            else{
                if(st.peek()=='(' && ch==')'){
                    st.pop();
                }
                else if(st.peek()=='{' && ch=='}'){
                    st.pop();
                }
                else if(st.peek()=='[' && ch==']'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            i++;
       }

       if(st.size()==0)return true;
       else return false;

    }
}