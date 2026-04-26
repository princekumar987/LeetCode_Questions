class Solution {
    public boolean validDigit(int n, int x) {

        String s=""+n;

        return !s.startsWith(""+x) && s.contains(""+x);
    }
}