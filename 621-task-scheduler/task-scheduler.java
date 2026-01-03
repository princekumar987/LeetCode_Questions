class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<tasks.length;i++){
              mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }

        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        pq.addAll(mp.keySet());
        int ans=tasks.length;
        List<Character>list=new ArrayList<>();

        while(pq.size()>0){
              
              if(pq.size()-1>=n){
                  int a=n+1;
                  while(a-->0){
                    char ch=pq.remove();
                    if(mp.get(ch)==1)mp.remove(ch);
                    else{
                        mp.put(ch,mp.get(ch)-1);
                        list.add(ch);
                    }
                  }
                  for(int i=0;i<list.size();i++){
                      pq.add(list.get(i));
                  }
                  list.clear();
              }
              else{
                   int a=n-pq.size()+1;
                   int x=pq.size();
                   while(x-->0){
                       char ch=pq.remove();
                       if(mp.get(ch)==1)mp.remove(ch);
                       else{
                          mp.put(ch,mp.get(ch)-1);
                          list.add(ch);
                        }
                   }

                   for(int i=0;i<list.size();i++){
                      pq.add(list.get(i));
                   } 
                   if(pq.size()>0)ans=ans+a;
                   list.clear();
              }

              
        }


        return ans;
    }
}