class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.trim();
        int n = str.length();
        for(int i = n - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                break;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.length();
    }
}