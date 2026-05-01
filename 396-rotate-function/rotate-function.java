class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int currentF = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            currentF +=  i * nums[i];
        }
        int maxVal = currentF;
        for (int i = n - 1; i > 0; i--) {
            currentF = currentF + totalSum - n * nums[i];
            maxVal = Math.max(maxVal, currentF);
        }

        return maxVal;
    }
}