class Solution {
    public boolean checkGoodInteger(int n) {
        boolean  flag = false;
        int sum = 0;
        int squareSum = 0;
        while(n > 0){
            int val = n % 10;
            sum += val;
            squareSum += (val * val);
            n /= 10;
        }
        if(squareSum - sum >= 50)return true;
        return flag;
    }
}