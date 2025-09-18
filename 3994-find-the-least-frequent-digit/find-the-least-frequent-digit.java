class Solution {
    public int getLeastFrequentDigit(int n) {
        int count[] = new int[10];
        if(n == 0)
        {
            return 0;
        }
        String s = String.valueOf(n);
        for(char ch:s.toCharArray())
            {
                count[ch - '0']++;
            }
        int min_freq = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++)
            {
                if(count[i] > 0 && count[i] < min_freq)
                {
                    min_freq = count[i];
                }
            }
        for(int i = 0; i < 10; i++)
            {
                if(count[i] == min_freq)
                {
                    return i;
                }
            }
        return -1;
    }
}