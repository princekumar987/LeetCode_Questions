class Solution {
    public boolean isPalindrome(int x) {
        long ans=0;
        long p=x;

        while(x>0){
            int rem=x%10;
            ans=ans*10+rem;
            x=x/10;
        }

        return ans==p; 
    }
}