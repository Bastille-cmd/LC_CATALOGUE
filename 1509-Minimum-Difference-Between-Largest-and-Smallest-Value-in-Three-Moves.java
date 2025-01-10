class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=3) return 0;
        int min=nums[nums.length-4]-nums[0];
        if(min>=nums[nums.length-3]-nums[1]){
            min=nums[nums.length-3]-nums[1];
        }
        if(min>=nums[nums.length-2]-nums[2]){
            min=nums[nums.length-2]-nums[2];
        }
        if(min>=nums[nums.length-1]-nums[3]){
            min=nums[nums.length-1]-nums[3];
        }
        return min;
    }
}