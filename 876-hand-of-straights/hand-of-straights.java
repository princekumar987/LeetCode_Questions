import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        TreeMap<Integer,Integer>mp=new TreeMap<>();

        for(int i=0;i<hand.length;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
        }

        while(mp.size()>0){

              int f=mp.firstKey();

              for(int i=f;i<f+groupSize;i++){
                  
                  if(!mp.containsKey(i))return false;
                  int c=mp.get(i);
                  if(c==1)mp.remove(i);
                  else mp.put(i,c-1);
              }
        }

        return true;

       
    }
}