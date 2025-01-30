class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        char ch='(';
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==')' && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.size();
    }
}