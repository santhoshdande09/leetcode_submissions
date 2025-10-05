class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int y = 0; y < words.length; y++)
        {
            for(int i = 0; i < words[y].length(); i++)
            {
                char ch = words[y].charAt(i);
                if(ch == x)
                {
                    ans.add(y);
                    break;
                }
            }
        }
        return ans;
    }
}