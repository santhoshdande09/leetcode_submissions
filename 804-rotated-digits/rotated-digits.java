class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            int val = i;
            boolean flag = false;
            while(val > 0){
                int r = val % 10;
                if(r == 2 || r == 5 || r == 6 || r == 9){
                    flag = true;
                }
                if((r == 0 || r == 1 || r == 8) && (flag == true))  flag = true;
                if(r == 3 || r == 4 || r == 7){
                    flag = false;
                    break;
                }
                val = val/10;
            }
            if(flag)  ans++;
        }
        return ans;
    }
}