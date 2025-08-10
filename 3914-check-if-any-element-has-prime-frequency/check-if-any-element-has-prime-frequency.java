class Solution {

    public static boolean prime(int n){

        if(n==1)return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }

        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        
        for(Integer e:mp.keySet()){
            if(prime(mp.get(e))){
                return true;
            }
        }

        return false;
        
    }
}