class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;

        int alt1 = 0, alt2 = 0;
        int ans = Integer.MAX_VALUE;

        int l = 0;

        for (int r = 0; r < str.length(); r++) {

            char expected1 = (r % 2 == 0) ? '0' : '1';
            char expected2 = (r % 2 == 0) ? '1' : '0';

            if (str.charAt(r) != expected1) alt1++;
            if (str.charAt(r) != expected2) alt2++;

            if (r - l + 1 > n) {
                char leftExpected1 = (l % 2 == 0) ? '0' : '1';
                char leftExpected2 = (l % 2 == 0) ? '1' : '0';

                if (str.charAt(l) != leftExpected1) alt1--;
                if (str.charAt(l) != leftExpected2) alt2--;

                l++;
            }

            if (r - l + 1 == n) {
                ans = Math.min(ans, Math.min(alt1, alt2));
            }
        }

        return ans;
    }
}