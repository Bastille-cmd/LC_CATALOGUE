class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length = 0;

        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == ' ' && length == 0) continue;
            if(s.charAt(i) == ' ' && length > 0) return length;
            else length++;
        }
        return length;
    }
}