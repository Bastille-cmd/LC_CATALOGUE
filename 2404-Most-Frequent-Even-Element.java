class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) continue;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
            }
        }
        if(max==0) return -1;
        for(Integer key: map.keySet()){
            if(map.get(key)==max)
            return key;
        }
        return -1;
    }
}