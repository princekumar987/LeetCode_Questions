class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
          
          ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
          
          for(int i=0;i<n;i++){
              adj.add(new ArrayList<>());
          }

          for(int i=0;i<times.length;i++){
              int src=times[i][0]-1;
              int des=times[i][1]-1;
              int time=times[i][2];
              adj.get(src).add(new int[]{des,time}); 
          }
          
          int []dis=new int[n];
          Arrays.fill(dis,Integer.MAX_VALUE);
          dis[k-1]=0;
          PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
          pq.add(new int[]{k-1,0});

          while(pq.size()>0){
              
              int []temp=pq.peek();
              int s=temp[0];
              int d=temp[1];
              pq.poll();

              for(int []a:adj.get(s)){
                   if(a[1]+d<dis[a[0]]){
                      dis[a[0]]=a[1]+d;
                      pq.add(new int[]{a[0],dis[a[0]]});
                   }
              }
          }

          int maxans=0;
          for(int i=0;i<dis.length;i++){
              maxans=Math.max(maxans,dis[i]);
          }

          if(maxans!=Integer.MAX_VALUE)return maxans;
          return  -1;

    }
}