class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String>list=new ArrayList<>();
        int p=0;
        while(true){
           if(p+k<s.length()){
               String str=s.substring(p,p+k);
               list.add(str);
               p=p+k;
           }
           else{
               String str=s.substring(p);
               list.add(str);
               break;
           }
        }
        String r=list.get(list.size()-1);
        if(r.length()!=k){
            int c=k-r.length();
            for(int i=0;i<c;i++){
                r=r+fill;
            }
            list.set(list.size()-1,r);
        }
        String []ans=new String [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}