class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while(map.size()>0){
            int card=map.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!map.containsKey(card)) return false;
                map.put(card,map.get(card)-1);
                if(map.get(card)==0) map.remove(card);
                card=card+1;
            }
        }
        return true;
    }
}