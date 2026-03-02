class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++)
        {
            int zeros = 0;
            for(int j = n - 1; j >= 0 && grid[i][j] == 0; j--)
            {
                    zeros++;
            }
                arr[i] = zeros;
        }
        int swaps = 0;
        for (int i = 0; i < n; i++) {

            int required = n - i - 1;
            int j = i;
            while (j < n && arr[j] < required) {
                j++;
            }
            if (j == n) return -1;
            while (j > i) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                swaps++;
            }
        }

        return swaps;
    }
}