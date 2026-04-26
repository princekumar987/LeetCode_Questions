class Solution {


   void dfs(int node, List<List<Integer>> adj, boolean[] vis, boolean[] present) {
         vis[node] = true;

         for (int e : adj.get(node)) {
              if (present[e] && !vis[e]) {
                 dfs(e, adj, vis, present);
               }
         }
}

    
    public int evenSumSubgraphs(int[] nums, int[][] edges) {


        List<List<Integer>>adj=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
             int x=edges[i][0];
             int y=edges[i][1];
             adj.get(x).add(y);
             adj.get(y).add(x);
        }

       // System.out.println(adj);

        int subset=(1<<n);
        int answer=0;

        for(int i=0;i<subset;i++){
              List<Integer>l=new ArrayList<>();
              int nodesum=0;
              for(int j=0;j<nums.length;j++){
                   
                   if((i&(1<<j))!=0){
                       l.add(j);
                       nodesum+=nums[j];
                   }
              }
            //System.out.println(l+" "+nodesum);
              if(l.size()>0 && nodesum%2==0){
                  
                   boolean []vis=new boolean[n];
                   boolean[] present = new boolean[n];

                   for (int node : l) {
                     present[node] = true;
                    }

                   int ans=0;

                   for(int r=0;r<l.size();r++){
                         if(!vis[l.get(r)]){
                            ans++;
                            dfs(l.get(r),adj,vis,present);
                          }
                   }
                  if(ans==1)answer++;
              }
    
        }

        return answer;
    }
}