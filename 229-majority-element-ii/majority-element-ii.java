class Solution {
    public List<Integer> majorityElement(int[] nums) {
          
          HashMap<Integer,Integer>mp=new HashMap<>();

          for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
          }

          List<Integer>ans=new ArrayList<>();
          
          for(Integer e:mp.keySet()){
               if(mp.get(e)>nums.length/3){
                   ans.add(e);
               }
          }
         
          return ans;
    }
}