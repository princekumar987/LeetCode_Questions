class Solution {
    public String frequencySort(String s) {
       
       HashMap<Character,Integer>mp=new HashMap<>();

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i); 
           mp.put(ch,mp.getOrDefault(ch,0)+1);
       }
       
       PriorityQueue<Character>pq=new PriorityQueue<>(
          (a,b)->
             { 
                if(mp.get(a)!=mp.get(b)){
                    return mp.get(b)-mp.get(a);
                 } 
                 else return  a.compareTo(b);
            });

            
       pq.addAll(mp.keySet());
       StringBuilder sb=new StringBuilder("");

       while(pq.size()>0){
           char c=pq.remove();
           int as=mp.get(c);
           while(as-->0){
              sb.append(c);
           }
       
       }  
       return sb.toString(); 
       
    }
}