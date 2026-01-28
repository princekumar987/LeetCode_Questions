class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashSet<Character>st=new HashSet<>();
       int j=0;
       int max=0;

       for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);    
              if(st.contains(ch)){
                    
                    while(j<i){
                        if(s.charAt(j)==ch){
                            st.remove(ch);
                            j++;
                            break;
                        }
                        else{
                            st.remove(s.charAt(j));
                            j++;
                        }
                    }
              }

              max=Math.max(i-j+1,max);
              st.add(ch);

       }

       return max;
    }
}