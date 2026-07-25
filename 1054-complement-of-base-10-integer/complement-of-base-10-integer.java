class Solution {
    public int bitwiseComplement(int n) {
       StringBuilder sb = new StringBuilder();
        String str = Integer.toBinaryString(n);
        for(char ch : str.toCharArray()){
            if(ch == '0')
                sb.append(1);
            else 
                sb.append(0);
        }
        return Integer.parseInt(sb.toString(), 2);

    }
}