class Solution {
    public boolean isPowerOfThree(int n) {
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i <= 19; i++)
        {
            st.add((int)Math.pow(3,i));
        }
        if(st.contains(n))
            return true;
        return false;
    }
}