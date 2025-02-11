class Solution {
    public int[][] sortMatrix(int[][] grid) {
      

      int n=grid.length;
      ArrayList<Integer>list=new ArrayList<>();

       for(int i=0;i<n;i++){
            
            int j=i;
            int k=0;
            while(j<n && k<n){
               list.add(grid[j][k]);
               j++;
               k++;
            }
            Collections.sort(list);
             j=i;
             k=0;
            int a=list.size()-1;
            while(j<n && k<n){
               grid[j][k]=list.get(a);
               a--;
               j++;
               k++;
            }
            list.clear();
       } 

        for(int i=1;i<n;i++){
            
            int j=i;
            int k=0;
            while(j<n && k<n){
               list.add(grid[k][j]);
               j++;
               k++;
            }
            Collections.sort(list);
             j=i;
             k=0;
            int a=0;
            while(j<n && k<n){
               grid[k][j]=list.get(a);
               a++;
               j++;
               k++;
            }
            list.clear();
       } 

       return grid;
    }
}