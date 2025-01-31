class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==1) return Math.max(nums[0],nums[1]);
        int prev=nums[0];
        int thiss=Math.max(nums[0],nums[1]);
        int total=0;
        for(int i=2;i<nums.length;i++){
            total=Math.max((nums[i]+prev),thiss);
            prev=thiss;
            thiss=total;
        }
        return Math.max(prev,thiss);
    }
}