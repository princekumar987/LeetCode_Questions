class Solution {
    public boolean checkDivisibility(int n) {
        
        int digitsum=0;
        int digitproduct=1;

        int a=n;

        while(a>0){

            int rem=a%10;
            digitsum+=rem;
            digitproduct*=rem;
            a/=10;

        }

        int total=digitsum+digitproduct;

        if(n%total==0)return true;
        else return false;
    }
}