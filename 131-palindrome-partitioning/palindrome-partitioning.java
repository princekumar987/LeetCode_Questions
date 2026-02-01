class Solution {

    void fun(String s, List<List<String>>ans, List<String>list, int idx){
           
           if(idx==s.length()){
               ans.add(new ArrayList<>(list));
           }

           for(int i=idx;i<s.length();i++){
               if(palin(s.substring(idx,i+1))){
                    list.add(s.substring(idx,i+1));
                    fun(s,ans,list,i+1);
                    list.remove(list.size()-1);
               }
           }
    }

    boolean palin(String s){
          int i=0;
          int j=s.length()-1;

          while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
          }

          return true;
    }
    public List<List<String>> partition(String s) {
        
        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        
        fun(s,ans,list,0);
        return ans;

    }
}