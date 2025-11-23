class Solution {
    public long sumAndMultiply(int n) {
         
         String s=String.valueOf(n);
         long digit=0;
         long sum=0;

         for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                digit=digit*10+(Integer.valueOf(s.charAt(i))-48);
                sum=sum+(Integer.valueOf(s.charAt(i))-48);
            }
         }

         

         return digit*sum;

    }
}