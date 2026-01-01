class Solution {
    public int myAtoi(String s) {

       s=s.trim();
       long ans=0;
       boolean p=false;

       for(int i=0;i<s.length();i++){
             
             if(i==0){
                 if(s.charAt(i)=='-'){
                    p=true;
                    continue;
                 }
                 else if(s.charAt(i)=='+'){
                    p=false;
                    continue;
                 }
             }

             if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                   int x=s.charAt(i)-'0';
                   ans=ans*10+x;

                   if(p){
                       long check=-ans;
                       if(check<=Integer.MIN_VALUE){
                          return Integer.MIN_VALUE;
                       }
                   }
                   else{
                       if(ans>=Integer.MAX_VALUE){
                          return Integer.MAX_VALUE;
                       } 
                   }
             }
             else{
                  break;
             }
       }

       if(p){
           ans=-ans;
       }

       return (int)ans;
    }
}