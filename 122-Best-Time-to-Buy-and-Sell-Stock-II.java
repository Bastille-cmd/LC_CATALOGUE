class Solution {
    public int maxProfit(int[] prices) {
        int[] arr=new int[prices.length];
        arr[0]=0;
        if(prices.length==1) return 0;
        int lowest=Math.max(prices[0],prices[1]);
        for(int i=1;i<prices.length;i++){
            if(lowest>prices[i]){
                lowest=prices[i];
            }
            arr[i]=Math.max(prices[i]-lowest,Math.max(arr[i-1],arr[i-1]+(prices[i]-prices[i-1])));
        }
        return arr[arr.length-1];
    }
}