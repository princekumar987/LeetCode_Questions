class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                for (int j = 0; j < nums.length; j++) {
                    if (Math.abs(i - j) <= k) {
                        st.add(j);
                    }
                }
            }
        }

        for (Integer e : st) {
            list.add(e);
        }

        Collections.sort(list);

        return list;
    }
}