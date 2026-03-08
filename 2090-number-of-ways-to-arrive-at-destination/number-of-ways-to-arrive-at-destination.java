class Solution {
    public int countPaths(int n, int[][] roads) {

        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<roads.length;i++){
              int src=roads[i][0];
              int des=roads[i][1];
              int time=roads[i][2];
              adj.get(src).add(new int[]{des,time});
              adj.get(des).add(new int[]{src,time});
        }
        
        int []way=new int[n];
        long []dis=new long[n];
        Arrays.fill(dis,Long.MAX_VALUE);
        PriorityQueue<long[]> q = new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        q.add(new long[]{0,0});
        dis[0]=0;
        way[0]=1;
        int mod=1000000007;

        while(q.size()>0){
              
              long []temp=q.peek();
              int newS=(int)temp[0];
              long newTime=temp[1];
              q.poll();

              for(int []a:adj.get(newS)){
                   if(newTime+a[1]<dis[a[0]]){
                       dis[a[0]]=newTime+a[1];
                       q.add(new long[]{a[0],newTime+a[1]});
                       way[a[0]]=way[newS];
                   }
                   else if(newTime+a[1]==dis[a[0]]){
                       way[a[0]]=(way[a[0]]+way[newS])%mod;
                   }
              }
        }

        return way[n-1]%mod;

    }
}