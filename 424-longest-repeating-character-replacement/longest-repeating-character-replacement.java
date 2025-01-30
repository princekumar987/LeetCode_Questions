class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        int j=0;
        int ans=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            if(mp.size()==1){
                ans=Math.max(ans,i-j+1);
                continue;
            }
            if(mp.size()>=2){
                min=Integer.MIN_VALUE;
                int sum=0;
                for(Character e:mp.keySet()){
                    sum=sum+mp.get(e);
                    min=Math.max(min,mp.get(e));
                }
                min=sum-min;
                if(min<=k){
                    ans=Math.max(ans,i-j+1);
                }
                else{
                    mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                    if(mp.get(s.charAt(j))==0){
                        mp.remove(s.charAt(j));
                    }
                    j++;
                }
            }

        }

        return ans;
    }
}