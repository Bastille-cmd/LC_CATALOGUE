class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int prev=nums[0];
        int thiss=Math.max(prev,nums[1]);
        int max=Math.max(prev,thiss);
        for(int i=2;i<nums.length-1;i++){
            max=Math.max(thiss,nums[i]+prev);
            prev=thiss;
            thiss=max;
        }
        int maxx=max;
        prev=nums[1];
        thiss=Math.max(prev,nums[2]);
        max=Math.max(prev,thiss);
        for(int i=3;i<nums.length;i++){
            max=Math.max(thiss,nums[i]+prev);
                prev=thiss;
                thiss=max;
        }
        return Math.max(max,maxx);
    }
}