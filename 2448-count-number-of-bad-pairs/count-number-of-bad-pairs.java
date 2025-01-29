class Solution {
    public long countBadPairs(int[] nums) {
       
       for(int i=0;i<nums.length;i++){
           nums[i]=nums[i]-i;
       }

       HashMap<Integer,Integer>mp=new HashMap<>();

       for(int i=0;i<nums.length;i++){
          int x=nums[i];
          if(mp.containsKey(x)){
            mp.put(x,mp.get(x)+1);
          }
          else{
            mp.put(x,1);
          }
       }
       long gh=0;

        for(Integer e:mp.keySet()){
            long a=mp.get(e);
            if(a>=2){
              gh+= (a*(a-1))/2 ;
            }
        }
        long x=nums.length;

       return (x*(x-1))/2 -gh;
    }
}