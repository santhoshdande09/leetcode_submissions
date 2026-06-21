class Solution {
    public int maxIceCream(int[] costs, int coins) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int i : costs){
        pq.add(i);
     }
     int ans = 0;
    long sum = 0;
    while(!pq.isEmpty()){
        sum+=pq.poll();
        if(sum <= coins)
            ans++;
    }
    return ans;
    }
}