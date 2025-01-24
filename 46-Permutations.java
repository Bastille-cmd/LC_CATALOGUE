class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        recur(nums,0,res);
        return res;
    }
    public void recur(int[] nums,int index, List<List<Integer>> res){
        int n=nums.length;
        if(index==n-1){
            List<Integer> sublist=new ArrayList<Integer>();
            for(int el:nums){
                sublist.add(el);
            }
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=index;i<n;i++){
            swap(nums,i,index);
            recur(nums,index+1,res);
            swap(nums,i,index);
        }
    }
    public void swap(int[] nums,int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}