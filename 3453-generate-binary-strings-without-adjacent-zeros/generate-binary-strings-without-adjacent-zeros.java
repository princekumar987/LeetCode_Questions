class Solution {

    public static void function(List<String>list,int n, StringBuilder sb,int lastchar){
        if(sb.length()==n){
            boolean p=true;
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)=='0' && sb.charAt(i)==sb.charAt(i+1)){
                    p=false;
                }
            }
            if(p)
            list.add(sb.toString());
            return ;
        }

        sb.append("1");
        function(list,n,sb,1);
        sb.deleteCharAt(sb.length()-1);

        sb.append("0");
        function(list,n,sb,0);
        sb.deleteCharAt(sb.length()-1);

    }
    public List<String> validStrings(int n) {
        
        List<String>list=new ArrayList<>();

        function(list,n,new StringBuilder(),-1);

        return list;
    }
}