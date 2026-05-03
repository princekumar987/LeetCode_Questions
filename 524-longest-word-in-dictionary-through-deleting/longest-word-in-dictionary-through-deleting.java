class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
            
            String ans="";

            for(int i=0;i<dictionary.size();i++){
                  String p=dictionary.get(i);
                  int j=0;
                  int k=0;
                  while(j<s.length()){
                    if(k<p.length() && s.charAt(j)==p.charAt(k)){
                        k++;
                    }
                    j++;
                  }
                  if(k>=p.length()){
                      if(ans.length()<p.length()){
                        ans=p;
                      }
                      else if(ans.length()==p.length()){
                          if(ans.compareTo(p)>0){
                                  ans=p;   
                          }
                      }
                  }
            }

            return ans;
    }
}