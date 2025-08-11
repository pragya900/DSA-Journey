class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int profit=0;
        for(int i =0;i<prices.length;i++){
            int cost = prices[i]-minimum;
            profit=Math.max(cost,profit);
            minimum=Math.min(minimum,prices[i]);
        }
        return profit;
        
    }
}