class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        if(nums.length==1) return nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                curr=curr+nums[i];
                if(max<curr) max=curr;
                continue;
            }
            curr=nums[i];
        }
        return Math.max(max,curr);
    }
}