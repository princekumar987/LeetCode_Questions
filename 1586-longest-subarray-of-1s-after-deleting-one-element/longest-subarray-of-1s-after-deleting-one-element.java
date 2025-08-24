class Solution {
    public int longestSubarray(int[] nums) {
        
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=0){
                  count++;
            }
            else{
                list.add(count);
                list.add(0);
                count=0;
            }
        }

        list.add(count);

        int ans=0;

        for(int i=0;i<list.size()-2;i++){
             int sum=list.get(i)+list.get(i+2);
             ans=Math.max(ans,sum);
        }

        if(list.size()==2){
            ans=Math.max(ans,list.get(0)+list.get(1));
        }
        if(list.size()==1){
            ans=Math.max(ans,list.get(0)-1);
        }

        //System.out.println(list);

        return ans;
    }
}