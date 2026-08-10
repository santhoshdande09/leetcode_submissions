class Solution {
    public String decodeString(String s) {
       Stack<Integer> nums = new Stack<>();
       Stack<String> str = new Stack<>();
       int val = 0;
       String st = "";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                val = val * 10 + (ch - '0');
            }
            else if(ch == '['){
                nums.push(val);
                str.push(st);
                val = 0;
                st = "";
            }
            else if(ch == ']'){
                int k = nums.pop();
                String prev = str.pop();
                StringBuilder sb = new StringBuilder(prev);
                while(k-- > 0){
                    sb.append(st);
                }
                st = sb.toString();
            }
            else{
                st += ch;
            }
        }
        return st;
    }
}