class Solution {
    public String makeFancyString(String s) {
        
        char []ch=s.toCharArray();

        StringBuilder sb=new StringBuilder("");
        int count=1;
        sb.append(ch[0]);

        for(int i=1;i<ch.length;i++){

            if(ch[i]==ch[i-1]){
                if(count==1){
                    sb.append(ch[i]);
                    count++;
                }
            }
            else{
                sb.append(ch[i]);
                count=1;
            }
        }
       

       return sb.toString();

    }
}