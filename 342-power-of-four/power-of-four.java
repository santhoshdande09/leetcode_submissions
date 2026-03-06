class Solution {
    public boolean isPowerOfFour(int n) {
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i <= 15; i++)
            st.add((int)Math.pow(4,i));
        if(st.contains(n))
            return true;
        return false;
    }
}