class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
          
          ArrayList<ArrayList<int[]>>adj=new ArrayList<>();

          for(int i=0;i<n;i++){
              adj.add(new ArrayList<>());
          }

          for(int i=0;i<flights.length;i++){
              int src1=flights[i][0];
              int des=flights[i][1];
              int price=flights[i][2];
              adj.get(src1).add(new int[]{des,price});
          }
          int []vis=new int[n];
          Arrays.fill(vis,(int)1e9);

          Queue<int[]>pq=new LinkedList<>();
          pq.add(new int[]{0,src,0});
          vis[src]=0;

          while(pq.size()>0){
               
               int []temp=pq.peek();
               int currPrice=temp[0];
               int currDes=temp[1];
               int level=temp[2];
               pq.poll();

               for(int []a:adj.get(currDes)){
                     
                     if(level<=k && vis[a[0]]>currPrice+a[1]){
                          vis[a[0]]=currPrice+a[1];
                          pq.add(new int[]{currPrice+a[1],a[0],level+1});
                     }
               }
          }

          if(vis[dst]!=(int)1e9)return vis[dst];
          return -1; 


    }
}