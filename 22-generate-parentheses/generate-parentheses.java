class Solution {

    public static void function(int n,List<String>list,String ans,int s,int e){
        
        if(ans.length()==2*n){
            list.add(ans);
            return ;
        }

        if(s<n){
             function(n,list,ans+"(",s+1,e); 
        }
        if(e<s){
            function(n,list,ans+")",s,e+1);
        }

        return ;
    
       
    }

    public List<String> generateParenthesis(int n) {
        

       List<String>list=new ArrayList<>();

       function(n,list,"",0,0);

       return list;
    }
}