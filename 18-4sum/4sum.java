class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

       Arrays.sort(nums);
       List<List<Integer>>ans=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
          
          if(i>0 && nums[i]==nums[i-1])continue;

          for(int j=i+1;j<nums.length;j++){
             
              if(j>i+1 && nums[j]==nums[j-1])continue;
              
              int k=j+1;
              int l=nums.length-1;

              while(k<l){
                  long s=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                  if(s<target)k++;
                  else if(s>target)l--;
                  else{
                      List<Integer>list=new ArrayList<>();
                      list.add(nums[i]);
                      list.add(nums[j]);
                      list.add(nums[k]);
                      list.add(nums[l]);
                      ans.add(list);
                      k++;
                      l--;
                      while(k<l && nums[k]==nums[k-1])k++;
                      while(k<l && nums[l]==nums[l+1])l--;
                  }
              }
          }
       }

       return ans;
    }
}