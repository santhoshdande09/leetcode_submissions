class Solution {
    public int minOperations(String s) {
        int ans = 0;
       
        for(char ch : s.toCharArray())
            {
            if(ch == 'a')
                continue;
            int dist = (26 - (ch - 'a')) % 26;
            ans = Math.max(ans,dist);
            }
    return ans;
    }
}