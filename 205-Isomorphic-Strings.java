class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char cha=t.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch)==cha)
                continue;
                else return false;
            }
            else{ 
                if(hm.containsValue(t.charAt(i)))
                return false;
                hm.put(ch,cha);
            }
        }
        return true;
    }
}