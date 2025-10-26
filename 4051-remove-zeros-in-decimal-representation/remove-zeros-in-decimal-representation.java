class Solution {
    public long removeZeros(long n) {
    String str = String.valueOf(n);
        StringBuilder san = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch != '0')
                {
                    san.append(ch);
                }
            }

            long result = Long.parseLong(san.toString());
        return result;
    }
}