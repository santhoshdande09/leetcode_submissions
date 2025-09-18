class Solution {
    public int mySqrt(int x) {
        
        if (x == 0 || x == 1)
            return x;
        int first = 1;
        int last = x;
        int mid = -1;

        
        while (first <= last) {
            
            mid = first + (last - first) / 2;

            
            if ((long) mid * mid > (long) x)
                last = mid - 1;
            else if (mid * mid == x)
                
                return mid;
            else
                
                first = mid + 1;
        }

        
        return Math.round(last);
    }
}