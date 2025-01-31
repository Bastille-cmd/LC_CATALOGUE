class Solution {
    public int climbStairs(int n) {
        int prev=1;
        int thiss=2;
        if(n==2) return 2;
        if(n==1) return 1;
        int next=prev+thiss;
        for(int i=3;i<=n;i++){
            next=prev+thiss;
            prev=thiss;
            thiss=next;
        }
        return next;
    }
}