class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int a=map.get(nums[i]);
                if(Math.abs(a-i)<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}