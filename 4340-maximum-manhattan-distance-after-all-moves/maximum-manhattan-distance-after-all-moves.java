class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l = 0, r = 0, w = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U')
                u++;
            else if (ch == 'D')
              d++;
            else if (ch == 'L') l++;
            else if (ch == 'R')
                r++;
            else w++;
        }

        int x = r - l;
        int y = u - d;

        return Math.abs(x) + Math.abs(y) + w;
    }
}