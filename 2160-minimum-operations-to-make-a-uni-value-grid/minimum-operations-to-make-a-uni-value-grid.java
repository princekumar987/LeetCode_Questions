class Solution {
    public int minOperations(int[][] grid, int x) {
        if(grid.length==1 &&  grid[0].length==1)return 0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int u=grid[i][j];
                list.add(u);
            }
        }
        Collections.sort(list);
        if(list.get(0)==list.get(list.size()-1))return 0;
        int r=list.size()/2;
        int a=list.get(r);
        int ans=0;
        for(int i=0;i<list.size();i++){
            int y=Math.abs(a-list.get(i));
            if(y%x!=0)return -1;
            ans=ans+y/x ;
        }
        return ans;
    }
}