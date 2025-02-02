class Solution {
    public boolean check(int[] nums) {
        
       int min=101;
       int a=0;
     

       for(int i=0;i<nums.length-1;i++){
          if(nums[i]>nums[i+1]){
            a=i+1;
            break;
          }
       }

       ArrayList<Integer>list=new ArrayList<>();

       for(int i=a;i<nums.length;i++){
           list.add(nums[i]);
       }

       for(int i=0;i<a;i++){
          list.add(nums[i]);
       }

       for(int i=0;i<list.size()-1;i++){
           if(list.get(i)>list.get(i+1))return false;
       }

       return true;

    }
}