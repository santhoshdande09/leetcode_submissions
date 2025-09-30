class Solution {
    public int romanToInt(String s) {
    
    char[] ch = s.toCharArray();
    int ans = 0;
    for (int i = 0; i < ch.length; i++) {
        int value = 0;
        // get the value of current roman char
        if (ch[i] == 'I') value = 1;
        else if (ch[i] == 'V') value = 5;
        else if (ch[i] == 'X') value = 10;
        else if (ch[i] == 'L') value = 50;
        else if (ch[i] == 'C') value = 100;
        else if (ch[i] == 'D') value = 500;
        else if (ch[i] == 'M') value = 1000;

        // if next is bigger, subtract current value
        if (i + 1 < ch.length) {
            int next = 0;
            if (ch[i + 1] == 'I') next = 1;
            else if (ch[i + 1] == 'V') next = 5;
            else if (ch[i + 1] == 'X') next = 10;
            else if (ch[i + 1] == 'L') next = 50;
            else if (ch[i + 1] == 'C') next = 100;
            else if (ch[i + 1] == 'D') next = 500;
            else if (ch[i + 1] == 'M') next = 1000;

            if (value < next) {
                ans -= value;
                continue;
            }
        }
        ans += value;
    }
    return ans;


    }
}