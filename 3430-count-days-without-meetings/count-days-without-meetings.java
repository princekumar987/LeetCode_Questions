class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, Comparator.comparing(o -> o[0]));

        int ans = meetings[0][0] - 1;
        int max = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] > max) {
                ans = ans + (meetings[i][0] - max - 1);

            }
            max = Math.max(max, meetings[i][1]);
        }

        ans = ans + (days - max);

        return ans;

    }
}