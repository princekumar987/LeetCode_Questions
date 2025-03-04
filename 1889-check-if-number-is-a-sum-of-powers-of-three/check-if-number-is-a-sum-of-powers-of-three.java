class Solution {
    public boolean checkPowersOfThree(int n) {
        
        
        int x=n;
        while(x>0){
            if(x%3==2)return false;
            x/=3;
        }

        return true;
    }
}