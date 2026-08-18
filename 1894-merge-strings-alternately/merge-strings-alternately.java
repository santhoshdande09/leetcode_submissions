class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder();
        if(n <= m){
        for(int i = 0; i < n; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
            sb.append(word2.substring(n));
        }
        else{
            for(int i = 0; i < m; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            }
            sb.append(word1.substring(m));
        }
        return sb.toString();
    }
}