class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
         
         int count=1;

         for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                if(count==k){
                    return true;
                }
                count=1;
            }
         }

         if(count==k)return true;
         else return false;
    }
}