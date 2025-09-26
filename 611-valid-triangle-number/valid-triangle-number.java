import java.util.*;
class Solution {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 0;
        int n = nums.length;

        for (int k = n - 1; k >= 2; k--) {
            int c = nums[k];
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int a = nums[i];
                int b = nums[j];

                if (a + b > c) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }
}