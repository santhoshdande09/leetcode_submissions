import java.util.Arrays;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Arrays.sort(nums);

        
        int maxFreq = 0;
        int currentFreq = 0;
        if (nums.length > 0) {
            currentFreq = 1;
            maxFreq = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    currentFreq++;
                } else {
                    currentFreq = 1;
                }
                if (currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                }
            }
        }


        int ans = 0;
        currentFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                currentFreq++;
            } else {
                currentFreq = 1;
            }
            if (currentFreq == maxFreq) {
                ans += maxFreq;
            }
        }

        return ans;
    }
}