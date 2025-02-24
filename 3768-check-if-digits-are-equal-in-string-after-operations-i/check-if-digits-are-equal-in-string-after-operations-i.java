class Solution {
    public boolean hasSameDigits(String s) {
        

        String ans=s;

        while(ans.length()>2){
             
             String p="";

             for(int i=0;i<ans.length()-1;i++){
                int a=ans.charAt(i)-'0';
                int b=ans.charAt(i+1)-'0';
                p=p+(a+b)%10;
             }
             ans=p;
        }

        if(ans.charAt(0)==ans.charAt(1))return true;
        else return false;
    }
}