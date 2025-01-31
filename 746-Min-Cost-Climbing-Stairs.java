class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return cost[0];
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        int prev=cost[0];
        int thiss=cost[1];
        int val=0;

        for(int i=2;i<cost.length;i++){
            val=Math.min(prev,thiss) + cost[i];
            prev=thiss;
            thiss=val;
        }
        return Math.min(prev,thiss);
    }
}