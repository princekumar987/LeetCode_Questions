class Solution {
    public String convert(String s, int numRows) {

       if(numRows==1)return s;

       List<StringBuilder>list=new ArrayList<>();

       for(int i=0;i<numRows;i++){
           list.add(new StringBuilder(""));
       }
       
       boolean p=true;
       int j=0;
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(p){
                StringBuilder sb=list.get(j);
                sb.append(ch);
                j++;
                if(j==numRows-1)p=false;
            }
            else{
                StringBuilder sb=list.get(j);
                sb.append(ch);
                j--;
                if(j==0)p=true;
            }
       }
       
       StringBuilder ans=new StringBuilder("");

       for(int i=0;i<numRows;i++){
           ans.append(list.get(i));
       }

       return ans.toString();
    }
}