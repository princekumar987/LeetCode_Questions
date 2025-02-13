class Solution {
    public int minOperations(int[] nums, int k) {
        
        int n=nums.length;
        PriorityQueue<Long>pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
           pq.add((long)nums[i]);
        }

        int ans=0;

        while(pq.size()>=2){
            long a=pq.remove();
            long b=pq.remove();
            if(a<k || b<k){
               long c=Math.min(a,b);
               long d=Math.max(a,b);
               long e=c*2+d;
               pq.add(e);
               ans++;
            }
            else{
                break;
            }
        }


        return ans;
    }
}