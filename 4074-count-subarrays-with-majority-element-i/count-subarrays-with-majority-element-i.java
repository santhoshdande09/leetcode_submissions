class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int val = 0;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) 
                    a++;
                else 
                    b++;
                if (a > b)
                    val++;
            }
        }
        return val;
    }
}