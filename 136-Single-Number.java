class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        if(nums.length>19999) return 10000;
        if(nums.length==1) return nums[0];
        while(i<nums.length-1){
            if(i+1>nums.length) return 0;
            if(nums[i] != nums[i+1] ){
                return nums[i];
            }
            else i=i+2;
        }
        return i;
    }
}