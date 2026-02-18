class Solution {
    public int firstUniqueFreq(int[] nums) {
          
          HashMap<Integer,Integer>mp=new HashMap<>();
          for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
          }
          HashMap<Integer,Integer>f=new HashMap<>();
          for(Integer e:mp.keySet()){
             f.put(mp.get(e),f.getOrDefault(mp.get(e),0)+1); 
          }

          for(int i=0;i<nums.length;i++){
               int x=mp.get(nums[i]);  
               if(f.get(x)==1)return nums[i];
          }

          return -1;

    }
}