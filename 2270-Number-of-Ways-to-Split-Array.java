class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        long left=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            if(left+nums[i]>=sum-nums[i]){
                count++;
                sum=sum-nums[i];
                left=left+nums[i];
            }
            else{  sum=sum-nums[i];
            left=left+nums[i];}
        }
        return count;
    }
}