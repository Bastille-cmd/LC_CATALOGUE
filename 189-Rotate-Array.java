class Solution {
    public void rotate(int[] nums, int k) {
        int index=k%nums.length;
        int[] arr=new int[nums.length-index];
        int j=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(i<arr.length){
                arr[i]=nums[i];
            }
            else{ 
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=arr[z];
            z++;
        }
    }
}