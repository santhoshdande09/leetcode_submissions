class Solution {
    public int earliestTime(int[][] tasks) {
        int small = Integer.MAX_VALUE;
        int n = tasks.length;
        for(int i = 0; i < n; i++)
            {
                int sum = tasks[i][0] + tasks[i][1];
                if(sum < small)
                    small = sum;
            }
        return small;
    }
}