class Solution {
    public int numSub(String s) {

         
         long  e=1000000007;
         long count=0;
         long  ans=0;

         for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='1')count++;
              else{
                  ans=(ans+(count*(count+1))/2)%e;              
                  count=0;
              }
         }

          ans=(ans+(count*(count+1))/2)%e;;

         return (int)ans;
    }
}