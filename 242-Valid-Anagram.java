class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int sum=0;
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                of=of+1;
                hm.put(ch,of);
            }
            else
            hm.put(ch,1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(hm.containsKey(ch)){ 
            int of=hm.get(ch);
            of=of-1;
            if(of<0)
            of=0;
            hm.put(ch,of);
            }
            else 
            return false;
        }
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            sum=sum+e.getValue();
        }
        if(sum!=0)
        return false;
        return true;
    }
}