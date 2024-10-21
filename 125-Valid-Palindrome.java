class Solution {
    public boolean isPalindrome(String s)
    {
        s=s.replaceAll(\[^a-zA-Z0-9]\,\\);
        int pointer1=0;
        int pointer2=s.length()-1;
        s=s.toLowerCase();
        if(s.length()<=1) return true;
        while(s.charAt(pointer1)==s.charAt(pointer2)){
            pointer1++;
            pointer2--;
            if(pointer1>pointer2){ 
            return true;
            }
        }
        if(s.charAt(pointer1)!=s.charAt(pointer2)) 
        return false;
        return false;
    }
}