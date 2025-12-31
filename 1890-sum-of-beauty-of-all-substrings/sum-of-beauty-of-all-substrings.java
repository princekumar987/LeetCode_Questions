class Solution {
    public int beautySum(String s) {

         HashMap<Character,Integer>mp=new HashMap<>();
         int ans=0;

         for(int i=0;i<s.length();i++){
            
              for(int j=i;j<s.length();j++){

                    char ch=s.charAt(j);
                    mp.put(ch,mp.getOrDefault(ch,0)+1);
                    int max=1;
                    int min=Integer.MAX_VALUE;
                    
                    for(Character r:mp.keySet()){
                            max=Math.max(max,mp.get(r));
                            min=Math.min(min,mp.get(r));
                    }
                    ans+=(max-min);
                    //System.out.println(s.substring(i,j+1)+" "+max+" "+min);
              }
              mp.clear();
         }  

         return ans; 
    }
}