class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas=total_gas+gas[i];
            total_cost=total_cost+cost[i];
        }
        if(total_gas<total_cost) return -1;
        int gas_in_tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            gas_in_tank=gas_in_tank+gas[i];
            gas_in_tank=gas_in_tank-cost[i];
            if(gas_in_tank<0){
                start=i+1;
                gas_in_tank=0;
            }
        }
        return start;
    }
}