class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        // while(n > 0)
        // {
        //     if((n & 1) != 0)
        //         ans++;
        //     n = n >> 1;
        // }
        String s = Integer.toBinaryString(n);
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == '1')
            ans++;
        }
        return ans;
    }
}