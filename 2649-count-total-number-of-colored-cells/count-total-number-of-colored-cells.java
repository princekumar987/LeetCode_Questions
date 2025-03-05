class Solution {
    public long coloredCells(int n) {

        long ans=1;

        int count=1;

        if(n==1)return 1;
        n--;
        long p=0;

        while(n-->0){
            ans=ans+(p*4)+4;
            p++;
        }


        return ans;
        
    }
}