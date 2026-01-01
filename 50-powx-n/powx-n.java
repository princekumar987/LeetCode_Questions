class Solution {
    public double myPow(double x, int n) {

          if(n==0)return 1;
          double ans=1;
           
          long nn=n;
          if(nn<0)nn=-nn;

          while(nn>0){
                
                if(nn%2==0){
                    x=x*x;
                    nn=nn/2;
                }
                else{
                    ans=ans*x;
                    nn--;
                }
          } 

          if(n<0)  return 1/ans;
          else{
               return ans;
          }
           
    }
}