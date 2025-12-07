class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
    if(low % 2 != 0 || high % 2 != 0)
    {
        ans = 1;
    }
    return ((high - low)/2)+ans;
}
}