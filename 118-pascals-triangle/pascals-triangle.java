class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>>list=new ArrayList<>();
        int [][]ans=new int [n][];
        for(int i=0;i<n;i++){
             ans[i]=new int [i+1];
             ans[i][0]=ans[i][i]=1;
             for(int j=1;j<i;j++){
                 ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
             }
        }
        for(int i=0;i<n;i++){
            List<Integer>p=new ArrayList<>();
            for(int j=0;j<ans[i].length;j++){
                p.add(ans[i][j]);
            }
            list.add(p);
        }
        return list;
    }
}