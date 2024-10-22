class Solution {
    public int fillCups(int[] amount) {
        int count=0;
        while(amount[0]+amount[1]+amount[2]>0){
            Arrays.sort(amount);
            if(amount[1]>0){
                amount[1]=amount[1]-1;
                amount[2]=amount[2]-1;
                count++;
                continue;
            }
            if(amount[2]>1) {
               amount[2]=amount[2]-2;
               count++;
            }
            else
                amount[2]=amount[2]-1;
            count++;
        }
        return count;
    }
}