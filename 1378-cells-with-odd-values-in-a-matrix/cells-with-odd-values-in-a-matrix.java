class Solution {
    public int oddCells(int m, int n, int[][] indices) {
            
            int [][]ans=new int[m][n];

            for(int i=0;i<indices.length;i++){
                 int a=indices[i][0];
                 int b=indices[i][1];

                 for(int j=0;j<=a;j++){
                     ans[j][b]++;
                 }
                 for(int j=a+1;j<m;j++){
                     ans[j][b]++;
                 }
                 for(int j=0;j<=b;j++){
                     ans[a][j]++;
                 }
                 for(int j=b+1;j<n;j++){
                     ans[a][j]++;
                 }  

            }

            int answer=0;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(ans[i][j]%2!=0)answer++;
                }
            }

            return answer;
    }
}