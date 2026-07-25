class Solution {
    public int maxProduct(int n) {
        int smax = 0;
        int fmax = 0;
        while(n > 0){
            int val = n % 10;
            if(val >= fmax){
                smax = fmax;
                fmax = val;
            }
            else if(val < fmax && val > smax){
                smax = val;
            }
            n /= 10;
        }
        return smax * fmax;
    }
}