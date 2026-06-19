class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int idx = 0;
        int ans = -1;
        for(int i = 0; i < n - m + 1; i++){
           if(haystack.startsWith(needle, i)){
            ans = i;
            break;
           }
            }
        return ans;
    }
}