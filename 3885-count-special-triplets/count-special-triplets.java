class Solution {
    public int specialTriplets(int[] nums) {

       Map<Integer,Integer>right=new HashMap<>();
       //System.out.println(nums.length);

       for(Integer e:nums){
          right.put(e,right.getOrDefault(e,0)+1);
       } 

       Map<Integer,Integer>left=new HashMap<>();
       long ans=0;
       int mod=1000000007;

       for(int i=0;i<nums.length;i++){

           int x=nums[i];
           right.put(x,right.get(x)-1);
           if(right.get(x)==0)right.remove(x);

           int y=2*x;

           long c1=left.getOrDefault(y,0);
           long c2=right.getOrDefault(y,0);

           ans=(ans+(c1*c2)%mod)%mod; 

           left.put(x,left.getOrDefault(x,0)+1);

       }

       return (int)(ans);
       
    }
}