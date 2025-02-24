class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count1]=nums[i];
                count1++;
            }
        }
        Arrays.fill(nums,(nums.length-count),nums.length,0);
    }
}