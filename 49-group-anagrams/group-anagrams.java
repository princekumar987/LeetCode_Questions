class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       HashMap<String,List<String>>mp=new HashMap<>();

       for(int i=0;i<strs.length;i++){

            char []ch=strs[i].toCharArray();
            Arrays.sort(ch);
            StringBuilder sb=new StringBuilder("");    

            for(int j=0;j<ch.length;j++){
                 sb.append(ch[j]);
            }

            String s=sb.toString();
            if(mp.containsKey(s)){
                 List<String>l=mp.get(s);
                 l.add(strs[i]);
                 mp.put(s,l);
            }
            else{
                List<String>l=new ArrayList<>();
                l.add(strs[i]);
                mp.put(s,l);
            }

       }

       List<List<String>>ans=new ArrayList<>();

       for(String e:mp.keySet()){
           ans.add(mp.get(e));
       }


       return ans;
       
    }
}