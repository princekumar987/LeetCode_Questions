class Solution {
    public boolean hasAlternatingBits(int n) {
        
      int rem=n%2;
      n/=2;
      while(n>0){
          
          if(rem==n%2)return false;
          else {
              if(rem==1)rem=0;
              else rem=1;
          }
          n/=2;
      }


      return true;
    }
}