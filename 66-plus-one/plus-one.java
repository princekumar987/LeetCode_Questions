class Solution {
    public int[] plusOne(int[] digits) {
           
           int idx=-1;
           int n=digits.length;

           for(int i=n-1;i>=0;i--){
               if(digits[i]!=9){
                 idx=i;
                 break;
               }
           }
     
           if(idx==-1){
               int []ans=new int[n+1];
               ans[0]=1;
               return ans;
           }
           else{
               int []ans=new int[n];
               for(int i=0;i<idx;i++){
                  ans[i]=digits[i];
               }
               ans[idx]=digits[idx]+1;
               return ans;
           }
    }
}