class Solution {
    public int jump(int[] nums) {
        int max=0;
        int count=0;
        if(nums[0]==0) return 0;
        if(nums[0]>nums.length-1 && nums.length==1) return 0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]+i;
        }
        int i=0;
        while(i<arr.length){
            if(arr[i]<nums.length-1){
                count++;
                int counter=arr[i]-i;
                int j=i+1;
                while(counter>0){
                    if(arr[j]>=arr.length-1){
                        return count+1;
                    }
                    else{
                        if(max<=arr[j]){
                            max=arr[j];
                            i=j;
                        }
                    }
                    counter--;
                    j++;
                }
                max=0;
            }
            else{
                return count+1;
            }
        }
        return 0;
    }
}