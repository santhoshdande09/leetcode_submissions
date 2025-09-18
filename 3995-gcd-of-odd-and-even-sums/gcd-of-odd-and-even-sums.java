class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum_odd = n * n;
        int sum_even = n * (n+1);
        int gcd = sum_even - sum_odd;
        return gcd;
    }
}