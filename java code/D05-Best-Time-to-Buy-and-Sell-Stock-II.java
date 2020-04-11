class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++){
            ans += Math.max(0, prices[i] - prices[i-1]);      //If prices[i] < prices[i-1], we can sell the stock at price[i-1]
        }
        return ans;
    }
}
