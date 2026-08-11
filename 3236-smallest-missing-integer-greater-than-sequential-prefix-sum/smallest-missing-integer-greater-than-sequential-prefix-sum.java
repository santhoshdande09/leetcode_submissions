class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int idx = 1;
        int sum = nums[0];
        while(idx < n && nums[idx] == nums[idx - 1] + 1){
            sum += nums[idx];
            idx++;
        }
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        while(st.contains(sum)){
            sum++;
        }
        return sum;
    }
}