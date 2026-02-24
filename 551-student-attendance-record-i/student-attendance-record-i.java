class Solution {
    public boolean checkRecord(String s) {
        /*int n = s.length();
        int absent = 0;
        int currentLength= 1;
        int maxLate = 0;
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == 'A')
                absent++;
        }
         for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) =='L' && s.charAt(i - 1) == 'L')
                currentLength++;
                 else
                currentLength = 1;
            if (currentLength > maxLate)
                maxLate = currentLength;
        }
        if(absent < 2 && maxLate < 3)
            return true;
            return false;*/


            // approach 2
        return !(s.contains("LLL")) && (s.indexOf('A') == s.lastIndexOf('A'));
    }
}