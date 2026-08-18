class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int ans = -1;
        for(int i = 0; i < n ; i++){
           if(haystack.startsWith(needle, i)){
            ans = i;
            break;
           }
            }
        return ans;
    }
}