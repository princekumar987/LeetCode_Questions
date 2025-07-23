class Solution {
    public int maximumGain(String s, int x, int y) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int ans1 = 0;
        int ans2 = 0;

        if (y >= x) {

            int a = 0;
            int b = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (st1.size() == 0)
                    st1.push(ch);
                else if (ch == 'a' && st1.peek() == 'b') {
                    st1.pop();
                    a++;
                } else {
                    st1.push(ch);
                }
            }

            String p = "";
            while (st1.size() > 0) {
                p = st1.pop() + p;
            }

            for (int i = 0; i < p.length(); i++) {
                char ch = p.charAt(i);
                if (st1.size() == 0)
                    st1.push(ch);
                else if (ch == 'b' && st1.peek() == 'a') {
                    st1.pop();
                    b++;
                } else {
                    st1.push(ch);
                }
            }

            ans1 = a * y + b * x;

        } else {

            int a = 0;
            int b = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (st2.size() == 0)
                    st2.push(ch);
                else if (ch == 'b' && st2.peek() == 'a') {
                    st2.pop();
                    a++;
                } else {
                    st2.push(ch);
                }
            }

            String p = "";
            while (st2.size() > 0) {
                p = st2.pop() + p;
            }

            for (int i = 0; i < p.length(); i++) {
                char ch = p.charAt(i);
                if (st2.size() == 0)
                    st2.push(ch);
                else if (ch == 'a' && st2.peek() == 'b') {
                    st2.pop();
                    b++;
                } else {
                    st2.push(ch);
                }
            }

            ans2 = a * x + b * y;

        }

        return Math.max(ans1, ans2);
    }
}