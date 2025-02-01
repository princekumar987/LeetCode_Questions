class Solution {
    public String findValidPair(String s) {
        
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int x=ch1-'0';
            int y=ch2-'0';
            if(ch1!=ch2 && mp.get(ch1)==x && mp.get(ch2)==y){
               return ""+ch1+ch2;
            }
        }

        return "";
    }
}