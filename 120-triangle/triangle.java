class Solution {

    public static int function(int i, int j, List<List<Integer>>list,int n,int [][]dp ){
        
        if(i==n-1){
            return list.get(i).get(j);
        }

        if(dp[i][j]!=-1)return dp[i][j];

        int m=list.get(i).get(j)+function(i+1,j,list,n,dp);
        int p=list.get(i).get(j)+function(i+1,j+1,list,n,dp);

        return dp[i][j]= Math.min(m,p);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        int [][]dp=new int[n][];

        for(int i=0;i<n;i++){
            dp[i]=new int[triangle.get(i).size()];
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        return function(0,0,triangle,n,dp);
    }
}