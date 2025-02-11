class Solution {
    public String removeOccurrences(String s, String part) {

        for (int i = 0; i < s.length(); i++) {

            if (s.contains(part)) {
                String p = s.substring(0, i);
                String q = s.substring(i, s.length());
                if (q.startsWith(part)) {
                    q = q.substring(part.length());
                    i = -1;
                }
                s = p + q;
            } 
            else {
                break;
            }

        }

        return s;

    }
}