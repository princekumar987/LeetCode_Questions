class Solution {
    public int countKthRoots(int l, int r, int k) {
           
           int a=(int)Math.round(Math.pow(l,(1.0)/k));
           int b=(int)Math.round(Math.pow(r,(1.0)/k));

           if((int)Math.pow(a,k)<l)a++;
           if((int)Math.pow(b,k)>r)b--;

           if(b>=a)return b-a+1;
           return 0;


    }
}