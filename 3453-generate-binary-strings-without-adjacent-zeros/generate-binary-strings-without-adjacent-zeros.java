class Solution {

    public static void function(List<String>list,int n, StringBuilder sb,int lastchar){
        if(sb.length()==n){
            list.add(sb.toString());
            return ;
        }

        sb.append("1");
        function(list,n,sb,1);
        sb.deleteCharAt(sb.length()-1);

        if(lastchar!=0){
          sb.append("0");
          function(list,n,sb,0);
          sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> validStrings(int n) {
        
        List<String>list=new ArrayList<>();

        function(list,n,new StringBuilder(),-1);

        return list;
    }
}