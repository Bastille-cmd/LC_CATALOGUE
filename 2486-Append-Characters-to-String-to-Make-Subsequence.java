class Solution {
    public int appendCharacters(String s, String t) {
        Stack<Character> stack=new Stack<>();
        int len=t.length();
        for(int i=t.length()-1;i>=0;i--){
            stack.push(t.charAt(i));
        }
        for(int i=0;i<=s.length()-1;i++){
            if(stack.isEmpty()) return len;
            if(s.charAt(i)==stack.peek()){
                stack.pop();
                len--;
            }
        }
        return len;
    }
}