class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString();
        int p1 = 0 , p2 = str.length()-1;
        while(p1 <= p2){
            if(str.charAt(p1) != str.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}