class Solution {
    public int minOperations(String s) {
        int start_0 = 0;
        int start_1 = 0;

        for(int i = 0; i < s.length(); i++) {

            char c_0 = (i % 2 == 0) ? '0' : '1';
            char c_1 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != c_0)
                start_0++;

            if(s.charAt(i) != c_1)
                start_1++;
        }

        return Math.min(start_0, start_1);
    }
}