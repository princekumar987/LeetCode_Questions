class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
           
           TreeMap<Integer,Integer>mp=new TreeMap<>();
           for(int i=0;i<bulbs.size();i++){
              mp.put(bulbs.get(i),mp.getOrDefault(bulbs.get(i),0)+1);
           }
           List<Integer>ans=new ArrayList<>();
           for(Integer e:mp.keySet()){
               if(mp.get(e)%2==1)ans.add(e);
           }

           return ans;
    }
}