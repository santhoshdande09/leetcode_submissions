class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        boolean a[] = new boolean[255];
        while(r < s.length())
        {
            int ch = s.charAt(r);
            while(a[ch] == true)
            {
                int c = s.charAt(l);
                a[c] = false;
                l++;
            }
            a[ch] = true;
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}