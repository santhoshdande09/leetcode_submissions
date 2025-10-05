class Solution {
    public int maxProduct(int[] nums) {
       int ans = 0;
        Arrays.sort(nums);
        int a = nums[nums.length - 1] - 1;
        int b = nums[nums.length - 2] - 1;
        ans = a*b;
        return ans;
    }
}