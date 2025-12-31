class Solution {
    public String reverseWords(String s) {
          
          String []str=s.split(" "); 
          Stack<String>st=new Stack<>();

          for(int i=0;i<str.length;i++){ 
               if(str[i].trim().length()>0){
                   st.add(str[i]);
               }
          }

          StringBuilder sb=new StringBuilder("");

          while(st.size()>0){
              sb.append(st.pop()+" ");
          }

          return sb.toString().trim();
    }
}