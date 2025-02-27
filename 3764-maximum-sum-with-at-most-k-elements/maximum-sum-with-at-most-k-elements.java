class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        
        int p=grid.length*grid[0].length;
        int [][]arr=new int[p][2];

        int l=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[l][0]=grid[i][j];
                arr[l][1]=i;
                l++;
            }
        }

        Arrays.sort(arr,Comparator.comparing(o->o[0]));
        
        int count=0;

        long ans=0;

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i][0]+" ");
            if(limits[arr[i][1]]!=0 && count<k){
                 ans=ans+arr[i][0];
                 count++;
                 limits[arr[i][1]]--;
            }
        }


        return ans;
    }
}