class Solution {
    public int minLength(int[] nums, int k) {
          
          HashMap<Integer,Integer>mp=new HashMap<>();
          int sum=0;
          int ans=Integer.MAX_VALUE;
          int j=0;
          for(int i=0;i<nums.length;i++){
               
               if(!mp.containsKey(nums[i])){
                   sum+=nums[i];
                   mp.put(nums[i],1);
               }
               else{
                   mp.put(nums[i],mp.get(nums[i])+1);
               }

               if(sum>=k){
                   ans=Math.min(ans,(i-j+1));
                   //System.out.println(ans);
                   while(j<=i){
                       int y=nums[j];
                       if(mp.containsKey(y) && mp.get(y)==1){
                          sum-=y;
                          mp.remove(y);
                          j++;
                       }
                       else if(mp.containsKey(y) && mp.get(y)>1){
                          mp.put(y,mp.get(y)-1);
                          j++;
                       }
                       if(sum<k)break;
                       ans=Math.min(ans,(i-j+1));
                   }
               }
          }
          
          if(ans==Integer.MAX_VALUE)return -1;
          return ans;
    }
}