class Solution {
    public long gridGame(int[][] grid) {

        int n=grid[0].length;

    
        long sum=0;

        for(int i=0;i<n;i++){

           sum=sum+grid[0][i];

        }

        
        long m=0;
        long max=Long.MAX_VALUE;


        for(int i=0;i<n;i++){
            sum=sum-grid[0][i];
            max=Math.min(max,Math.max(sum,m));
            m=m+grid[1][i];
        }

        return max;


    }
}