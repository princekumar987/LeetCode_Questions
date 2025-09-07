class Solution {
    public int[] sumZero(int n) {

        int []ans=new int[n];
        int a=n/2;
        int i=1;
        int j=0;

        while(i<=a){
             ans[j++]=-i;
             ans[j++]=i;
             i++;
        }

        if(n%2!=0){
            ans[n-1]=0;
        }

        return ans;
        
    }
}