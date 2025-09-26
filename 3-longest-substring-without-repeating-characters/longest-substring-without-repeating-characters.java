import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            int charIndex = (int) currentChar;

            if (lastSeen[charIndex] >= start) {
                start = lastSeen[charIndex] + 1;
            }

            lastSeen[charIndex] = end;

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}