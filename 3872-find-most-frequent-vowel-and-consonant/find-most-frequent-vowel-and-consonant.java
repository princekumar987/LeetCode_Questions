class Solution {
    public int maxFreqSum(String s) {
           
           HashMap<Character,Integer>mp=new HashMap<>();

           for(int i=0;i<s.length();i++){
               mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
           }

           int v=0;
           int c=0;

           for(Character ch:mp.keySet()){
              
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                  v=Math.max(v,mp.get(ch));
              }
              else{
                  c=Math.max(c,mp.get(ch));
              }

           }

           return v+c;
    }
}