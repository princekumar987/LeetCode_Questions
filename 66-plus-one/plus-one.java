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
               for(int i=n-1;i>idx;i--){
                  digits[i]=0;
               }
               digits[idx]=digits[idx]+1;
               return digits;
           }
    }
}