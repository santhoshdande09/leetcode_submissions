class Solution {
    static HashSet<Integer> st = new HashSet<>();
    static{
    st.add(2);
    st.add(3);
    st.add(5);
    st.add(7);
    st.add(11);
    st.add(13);
    st.add(17);
    st.add(19);
    st.add(23);
    st.add(29);
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left; i <= right; i++)
        {
            int val = Integer.bitCount(i);
            if(st.contains(val))
                ans++;
        }
        return ans;
    }
}