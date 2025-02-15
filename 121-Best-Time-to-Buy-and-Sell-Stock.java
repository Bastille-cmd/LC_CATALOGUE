class Solution {
    public int maxProfit(int[] prices) {
        int lowest=prices[0];
        int profit=0;
        if(prices.length==1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
            }
            profit=Math.max(profit,prices[i]-lowest);
        }
        return profit;
    }
}