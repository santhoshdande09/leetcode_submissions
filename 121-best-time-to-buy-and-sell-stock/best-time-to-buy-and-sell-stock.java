class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=i+1;
        int mx=0;
        while(i<prices.length-1){
          if(prices[i]>=prices[j]){
            i++;
            j=i+1;
          }else{
            mx=Math.max(prices[j]-prices[i],mx);
            j++;
          }
          if(j==prices.length){
            i++;
            j=i+1;
          }
        }
        return mx;
    }
}