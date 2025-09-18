class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int m = friends.length;
        int min = Math.min(n,m);
        int result[] = new int[min];
        int k = 0;
        for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                    {
                        if(order[i] == friends[j])
                        {
                            result[k] = order[i];
                            k++;
                        }
                    }
            }
                return result;
    }
}