class Solution {
    static String ans;
    static int count;
    public String getHappyString(int n, int k) {
        
        ans="";
        count=0;

        fun(n,k, new StringBuilder(""));

        return ans;

    }

    static boolean fun(int n, int k, StringBuilder s){

        if(s.length()==n){
            count++;
            if(count==k){
                ans=s.toString();
                return true;
            }
            else{
                return false;
            }
        }

        for(char ch='a';ch<='c';ch++){
            if(s.length()>0 && s.charAt(s.length()-1)==ch)continue;
            s.append(ch);
            if(fun(n,k,s)){
                return true;
            }
            s.deleteCharAt(s.length()-1);
        }

        return false;
    }
}