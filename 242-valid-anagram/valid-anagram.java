class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        char c[] = t.toCharArray();
        Arrays.sort(c);
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i = 0; i < s.length(); i++)
        {
            if(ch[i] != c[i])
            {
                return false;
            }
        }
        return true;
    }
}