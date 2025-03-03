class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                count++;
            }
            else {
                list2.add(nums[i]);
            }
        }
         
         
         int []arr=new int[nums.length];
         int i=0;
         for(int j=0;j<list1.size();j++){
             arr[i]=list1.get(j);
             i++;
         }
         for(int j=0;j<count;j++){
             arr[i]=pivot;
             i++;
         }
         for(int j=0;j<list2.size();j++){
             arr[i]=list2.get(j);
             i++;
         }
         return arr;
    }
}