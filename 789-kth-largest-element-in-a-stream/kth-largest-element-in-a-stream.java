class KthLargest {
     
    PriorityQueue<Integer>pq;
    int k; 

    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        Arrays.sort(nums);
        int i=nums.length-1;
        int a=k;
        while(a-->0 && i>=0){
            pq.add(nums[i]);
            i--;
        }
    }
    
    public int add(int val) {
         
         if(pq.size()<k){
            pq.add(val);
            if(pq.size()==k)return pq.peek();
            return -1;
         }

         int a=pq.remove();
         if(a>=val){
            pq.add(a);
         }
         else{
            pq.add(val);
         }
         

         return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */