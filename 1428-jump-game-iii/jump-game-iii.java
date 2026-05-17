class Solution {
    public boolean canReach(int[] nums, int start) {

           int count=0;

           for(int e:nums){
              if(e==0)count++;
           }
           if(count==0)return false;
           
           if(nums[start]==0)return true;

           Queue<Integer>q=new LinkedList<>();
           q.add(start);
           nums[start]=-nums[start];

           while(q.size()>0){
                   
                   int a=q.peek();
                   q.remove();
                   int ele=Math.abs(nums[a]);

                   int lefta=a-ele;
                   int righta=a+ele;
                   if(lefta>=0 && nums[lefta]>=0){
                       if(nums[lefta]==0)return true;
                       q.add(lefta);
                       nums[lefta]=-nums[lefta];
                   }
                   if(righta<nums.length && nums[righta]>=0){
                       if(nums[righta]==0)return true;
                       q.add(righta);
                       nums[righta]=-nums[righta];
                   }

           }

           return false;
    }
}