class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int k : coins) {
            for (int i = k; i <= amount; i++) {
                dp[i] += dp[i - k];
            }
        }

        return dp[amount];
    }
}