class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i][0];
            int y = nums1[i][1];
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + y);
            } else {
                mp.put(x, y);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            int x = nums2[i][0];
            int y = nums2[i][1];
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + y);
            } else {
                mp.put(x, y);
            }
        }

        int[][] ans = new int[mp.size()][2];

        int i = 0;

        for (Integer e : mp.keySet()) {
            ans[i][0] = e;
            ans[i][1] = mp.get(e);
            i++;
        }

        Arrays.sort(ans, Comparator.comparing(o -> o[0]));

        return ans;
    }
}