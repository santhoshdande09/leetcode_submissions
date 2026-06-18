class Solution {
    public double angleClock(int hour, int minutes) {
        double ans1 = Math.abs((30 * hour - 5.5 * minutes));
        if((360 - ans1) >= ans1)
            return ans1;
        return (360 - ans1);

        
    }
}