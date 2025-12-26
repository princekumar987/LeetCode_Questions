class Solution {
    public int longestConsecutive(int[] nums) {

      HashSet<Integer>st=new HashSet<>();

      for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
      }
      
      int ans=0;
      for(Integer e:st){
           if(!st.contains(e-1)){
               int current=e;
               int count=0;
               while(st.contains(current)){
                   count++;
                   current++;
               }
               ans=Math.max(count,ans);
           }
      }

      return ans;
       
      
    }
}