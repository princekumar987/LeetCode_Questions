class Solution {
    public int maximumSum(int[] nums) {
       
       int n=nums.length;
       int [][]arr=new int[n][2];

       for(int i=0;i<n;i++){

         arr[i][0]=nums[i];
         int x=nums[i];
         int sum=0;

         while(x>0){
           sum=sum+(x%10);
           x=x/10;
         }

         arr[i][1]=sum;

       }

       Arrays.sort(arr,Comparator.comparing(o->o[1]));

       int ans=0;
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       pq.add(arr[0][0]);

       for(int i=0;i<n-1;i++){
          if(arr[i][1]==arr[i+1][1]){
              pq.add(arr[i+1][0]);
          }
          else{
            if(pq.size()>1){
              int x=pq.remove();
              int y=pq.remove();
              ans=Math.max(ans,x+y);
            }
              pq.clear();
              pq.add(arr[i+1][0]);
          }
       }

       if(pq.size()>1){
              int x=pq.remove();
              int y=pq.remove();
              ans=Math.max(ans,x+y);
        }
      
      if(ans==0)return -1;

      return ans;
    }
}