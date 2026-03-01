class Solution {
    public int minPartitions(String n) {
        int m = n.length();
        char ch[] = n.toCharArray();
        int max = 0;
        for(int i = 0; i < m; i++)
        {
            if((ch[i] - '0') > max)
            {
                max = ch[i] - '0';
            }
        }
        return max;
    }
}