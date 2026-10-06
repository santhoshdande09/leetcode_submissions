class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stk.push(ch);
            }
            if(ch == ')'){
            if(stk.size() != 0 && stk.peek() == '('){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
            }


    }
            return stk.size();
    }
}