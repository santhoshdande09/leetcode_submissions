class Solution {
    public String reverseWords(String s) {
        char ch[] = s.toCharArray();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            char c = ch[i];
            if(c == ' '){
                if(sb.length() != 0){
                    if(ans.length() > 0){
                        ans.append(' ');
                    }
                    ans.append(sb.reverse());
                }
                sb.setLength(0);
            }else{
                sb.append(c);
            }
        }
         if (sb.length() > 0) {
            if (ans.length() > 0) {
                ans.append(' ');
            }
            ans.append(sb.reverse());
        }
        return ans.toString();
    }
}