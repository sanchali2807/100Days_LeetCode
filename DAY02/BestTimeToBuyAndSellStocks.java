class Solution {
    public int maxProfit(int[] prices) {
    int n = prices.length;
    int buyprice = prices[0];
    int maxprofit = 0;
    for(int i=0;i<n;i++){
        if(buyprice>prices[i]){
            buyprice=prices[i];
        }
        maxprofit = Math.max(maxprofit , prices[i] - buyprice);
    }
    return maxprofit;
    }
}
