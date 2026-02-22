class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int len = s.length();
        int max = 0;
        int temp = -1;
        for(int i = 0; i < len; i++)
        {
            if(s.charAt(i) == '1')
                {
                    if(temp != -1)
                    {
                        max = Math.max(max, i - temp);
                    }
                    temp = i;
                }
        }
        return max;

    }
}