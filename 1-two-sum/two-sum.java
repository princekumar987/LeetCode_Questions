class Solution {
    public int[] twoSum(int[] nums, int target) {

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

          int x=0;
          int y=0;
          int a=0;
          int b=0;

          for(int i=0;i<nums.length;i++){
             x=nums[i];
             a=i;
            mp.put(x,mp.get(x)-1);
            if(mp.get(x)==0)mp.remove(x);
             y=target-x;
            if(mp.containsKey(y))break;
          }

          for(int i=a+1;i<nums.length;i++){
            if(nums[i]==y){
                b=i;
                break;
               }
          }

          return new int []{a,b};
    }
}