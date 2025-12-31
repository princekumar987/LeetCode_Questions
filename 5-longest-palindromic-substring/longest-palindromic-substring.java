class Solution {
    public String longestPalindrome(String s) {
            
            String ans="";
            for(int i=0;i<s.length();i++){
                   
                   for(int j=i;j<s.length();j++){
                      String str=s.substring(i,j+1);
                      //System.out.println(str);
                      int m=0;
                      int n=str.length()-1;
                      boolean p=true;
                      while(m<n){
                          if(str.charAt(m)!=str.charAt(n)){
                            p=false;
                            break;
                          }
                          m++;
                          n--;
                      }
                      if(p){
                         // System.out.println(str);
                          if(str.length()>ans.length()){
                               ans=str;
                          }
                      }

                   }
            }


            return ans;
    }
}