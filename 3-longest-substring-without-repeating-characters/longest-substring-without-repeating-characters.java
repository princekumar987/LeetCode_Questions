class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character>st=new HashSet<>();
        int max=0;

        int j=0;
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(!st.contains(ch)){
                st.add(ch); 
                max=Math.max(max,st.size());  
             }
             else{  
                while(j<i){
                   char c=s.charAt(j);
                   if(c!=ch){
                      st.remove(c);
                      j++;
                    }
                    else{
                        j++;
                       break;
                    }
                }
             }
        }


        return max;
      
    }
}