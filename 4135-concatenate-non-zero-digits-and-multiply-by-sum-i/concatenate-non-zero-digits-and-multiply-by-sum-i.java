class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)
            return 0;
        String str = Integer.toString(n);
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != '0'){
                sb.append(ch);
                sum += (ch - '0');
            }
        }
            long val = Integer.parseInt(sb.toString());
            return val * sum;
    }
}