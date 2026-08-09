class Solution {
    public double minPrice(int[] prices, int[] discounts) {
       int n = prices.length - 1;
       int m = discounts.length - 1;
       double ans = 0;
       Arrays.sort(prices);
       Arrays.sort(discounts);
       while(n >= 0){
        if(m >= 0){
            ans += prices[n] * ((100.0 - discounts[m])/100.0);
            m--;
        }
        else
            ans += prices[n];
        n--;
       }
       return ans;
    }
}