class Solution {
    public int twoCitySchedCost(int[][] costs) {
         
         int n=costs.length/2;
         int [][]arr=new int[costs.length][2];

         for(int i=0;i<costs.length;i++){
              arr[i][0]=costs[i][0]-costs[i][1];
              arr[i][1]=i;
         }

         Arrays.sort(arr,Comparator.comparing(o->o[0]));
         int sum=0;
         for(int i=0;i<costs.length;i++){

              int idx=arr[i][1];

              if(i<n){
                 sum+=costs[idx][0];
              } 
              else{
                 sum+=costs[idx][1];
              }
             
         }

         return sum;
   }
}