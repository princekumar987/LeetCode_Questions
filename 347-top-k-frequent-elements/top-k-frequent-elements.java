class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       HashMap<Integer,Integer>mp=new HashMap<>();

       for(int i=0;i<nums.length;i++){
          mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }

       PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
       
       for(Integer e:mp.keySet()){
             pq.add(e);
             if(pq.size()>k)pq.remove(); 
       }

       int []ans=new int[k];
       
       int j=0;
       while(pq.size()>0){
          ans[j++]=pq.remove();
       } 
       
       return ans;

    }
}