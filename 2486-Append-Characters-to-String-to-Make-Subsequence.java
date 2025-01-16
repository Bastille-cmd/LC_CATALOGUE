class Solution {
    public int appendCharacters(String s, String t) {
        int len=t.length();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(len>0){ 
            if(s.charAt(i)==t.charAt(j)){
                j++;
                len--;
            }
            }
        }
        return len;
    }
}