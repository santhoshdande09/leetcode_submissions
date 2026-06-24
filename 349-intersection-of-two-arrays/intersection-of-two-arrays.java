class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        int idx = 0;
        for(int i : nums1){
           st.add(i);
        }
        for(int k : nums2){
            if(st.contains(k))  res.add(k);
        }
        int ans[] = new int[res.size()];
        for(int i : res){
            ans[idx++] = i;
        }
        return ans;
    }
}