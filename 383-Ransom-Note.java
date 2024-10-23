class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int sum=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch,nf);
            }
            else
            hm.put(ch,1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                int nf=of-1;
                if(nf<0)
                nf=0;
                hm.put(ch,nf);
            }
        }
        for(Map.Entry<Character, Integer> e : hm.entrySet())
        sum=sum+e.getValue();
        if(sum<=0)
        return true;
        return false;
    }
}