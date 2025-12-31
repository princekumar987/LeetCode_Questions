class Solution {
    public String frequencySort(String s) {
       
       HashMap<Character,Integer>mp=new HashMap<>();

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i); 
           mp.put(ch,mp.getOrDefault(ch,0)+1);
       }

       int [][]ans=new int[mp.size()][2];
       
       int j=0;
       for(Character ch:mp.keySet()){
            ans[j][0]=(int)ch;
            ans[j][1]=mp.get(ch);
            j++;
       }

       Arrays.sort(ans,Comparator.comparing(o->o[1]));
       StringBuilder sb=new StringBuilder("");

       for(int i=ans.length-1;i>=0;i--){
              char ch=(char)ans[i][0];
              for(j=0;j<ans[i][1];j++){
                  sb.append(ch);
              }
       }

       return sb.toString();

       
    }
}