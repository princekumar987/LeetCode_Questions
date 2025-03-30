class Solution {
    public List<Integer> partitionLabels(String s) {

     ArrayList<Integer>list=new ArrayList<>();
     HashMap<Character,Integer>mp=new HashMap<>();

     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(mp.containsKey(ch)){
             mp.put(ch,mp.get(ch)+1);
         }
         else{
             mp.put(ch,1);
         }
     }   
     int count=0;
     int c=0;
     HashSet<Character>st=new HashSet<>();

     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         st.add(ch);
         c++;

         if(mp.containsKey(ch)){
             mp.put(ch,mp.get(ch)-1);
             
             if(mp.get(ch)==0){
                 mp.remove(ch);
                  st.remove(ch);
             }
         }
         
         if(st.size()==0){
             list.add(c);
             c=0;
         }
     }
     return list;

    }
}