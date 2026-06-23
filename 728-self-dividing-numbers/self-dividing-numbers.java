class Solution {
    public boolean digit(int n){
        String s = String.valueOf(n);
        for(char ch : s.toCharArray()){
            int val = ch - '0';
            if((val == 0) || (n % val != 0)){
                return false;
            }
        }
        return true;
        }
    
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(digit(i))
                ans.add(i);
        }
    return ans;
    }
}