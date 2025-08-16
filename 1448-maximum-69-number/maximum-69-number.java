class Solution {

    public int maximum69Number (int num) {
             
             StringBuilder sb=new StringBuilder("");

             int count=0;
             String s=""+num;

             for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='6' && count==0){
                    sb.append("9");
                    count++;
                }
                else{
                    sb.append(s.charAt(i));
                }
             }

             return Integer.parseInt(sb.toString());
    }
}