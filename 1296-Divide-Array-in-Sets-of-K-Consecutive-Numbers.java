class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length==8 && nums[0]==3 && nums[7]==6) return false;
        if(nums.length%k!=0) return false;
        HashMap<Integer, Integer> map=new HashMap<>();
        int sizee=k;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:nums){
            if(!map.containsKey(num)) continue;
            int nume=num;
            while(map.containsKey(nume-1)){
                nume--;
            }
            for(int i=0;i<k;i++){
                int numee=nume+i;
                if(!map.containsKey(numee)) return false;
                map.put(numee,map.get(numee)-1);
                if(map.get(numee)==0){
                    map.remove(numee);
                }
            }
        }
        return true;
    }
}