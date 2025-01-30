class Solution {
    public boolean closeStrings(String s, String t) {

        if(s.length()!=t.length())return false;
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
       
        HashMap<Character,Integer>mp1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(mp1.containsKey(ch)){
                mp1.put(ch,mp1.get(ch)+1);
            }
            else{
                mp1.put(ch,1);
            }
        }

        if(mp.size()!=mp1.size())return false;

        for(Character e:mp.keySet()){
            if(!mp1.containsKey(e))return false;
        }
        for(Character e:mp1.keySet()){
            if(!mp.containsKey(e))return false;
        }
        
        ArrayList<Integer>list1=new ArrayList<>();

        for(Character e:mp.keySet()){
            list1.add(mp.get(e));
        }
         ArrayList<Integer>list2=new ArrayList<>();

        for(Character e:mp1.keySet()){
            list2.add(mp1.get(e));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        // System.out.println(list1);
        // System.out.println(list2);


        if(list1.equals(list2))return true;



        return false;
        
    }
}