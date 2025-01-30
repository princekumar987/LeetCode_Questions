class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
       
       int ans=0;
       int n=nums.length;
       HashSet<Integer>st=new HashSet<>();

       for(int i=0;i<n;i++){
          for(int j=i;j<n-1;j++){
              st.add(nums[j]-nums[j+1]);
              if(st.size()==1 && ((j+2-i)>=3)){
                ans++;
              }
              else if(st.size()>=2){
                st.clear();
                break;
              }
          }
       }

       return ans;
    }
}