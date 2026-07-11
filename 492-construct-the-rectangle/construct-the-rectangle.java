class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);

        while (area % w != 0) {
            w--;
        }

        int[] ans = new int[2];
        ans[0] = area / w;
        ans[1] = w;

        return ans;
    }
}