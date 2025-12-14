class Solution {

    static boolean valid(String s){

        if(s.length()==0)return false;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9') || ch=='_' ){
                continue;
            }
            else return  false;
        }

        return true;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
         
        HashMap<String,List<String>>mp=new HashMap<>();
        int n=code.length;

         for(int i=0;i<n;i++){
             String s1=code[i];
             String s2=businessLine[i];
             boolean b=isActive[i];
            if(valid(s1)){
               if(s2.equals("electronics") || s2.equals("grocery") || s2.equals("pharmacy") || s2.equals("restaurant")  ){
                  if(b==true){
                     if(mp.containsKey(s2)){
                         mp.get(s2).add(s1);
                     }
                     else{
                        List<String>list1=new ArrayList<>();
                        list1.add(s1);
                        mp.put(s2,list1);
                     }
                  }

               }
            }
         }

         List<String>l=new ArrayList<>();
         l.add("electronics");
         l.add("grocery");
         l.add("pharmacy");
         l.add("restaurant");

        List<String>ans=new ArrayList<>();

         for(int i=0;i<4;i++){
            String p=l.get(i);
            if(mp.containsKey(p)){
                List<String>w=mp.get(p);
                Collections.sort(w,(a,b)->a.compareTo(b));
                for(int j=0;j<w.size();j++){
                    ans.add(w.get(j));
                }
            }
         }

         return ans;
    }
}