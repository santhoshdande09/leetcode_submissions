class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = triangle.get(n - 1).get(i);
        }
        for (int i= n - 2; i >= 0; i --) {
            for (int j = 0; j <= i; j++) {
                arr[j] = triangle.get(i).get(j) + Math.min(arr[j], arr[j + 1]);
            }
        }
        
        return arr[0];
    

    }
}