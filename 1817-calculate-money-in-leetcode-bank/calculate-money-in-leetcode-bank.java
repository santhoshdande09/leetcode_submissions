class Solution {
    public int totalMoney(int n) {
        int val = n/7;
        int rem = n % 7;
        int ans = 0;
        for(int i = 0; i < val; i++){
            ans += (28 + (i * 7));
        }
        int temp = val + 1;
        while(rem-- > 0){
            ans += temp;
            temp++;
        }
        return ans;
    }
}