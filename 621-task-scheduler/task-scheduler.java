class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<tasks.length;i++){
              mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }
        int ans=tasks.length;

        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Character c:mp.keySet()){
            pq.add(mp.get(c));
        }
        
        List<Integer>list=new ArrayList<>();

        while(pq.size()>0){
               
               if(pq.size()-1>=n){
                     int a=n+1;
                     while(a-->0){
                        int df=pq.remove();
                        if(df==1);
                        else{
                            list.add(df-1);
                        }
                     }

                     for(int i=0;i<list.size();i++){
                        pq.add(list.get(i));
                     }
                     list.clear();
               }
               else{
                   int a=n-pq.size()+1;
                   int fg=pq.size();

                   while(fg-->0){
                       int fh=pq.remove();
                       if(fh==1)continue;
                       else{
                          list.add(fh-1);
                       }
                   }

                   for(int i=0;i<list.size();i++){
                       pq.add(list.get(i));
                   }
                   list.clear();

                   if(pq.size()>0)ans=ans+a;
               }
               System.out.println(pq);
        }
        

        return ans;
    }
}