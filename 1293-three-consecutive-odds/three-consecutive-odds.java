class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = 0;
                continue;
            }
            count++;
            if (count == 3) {
                return true;
            }
        }
        
        return false;

    }
}