class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        char ch1=')';
        char ch2='}';
        char ch3=']';
        for(int i=1;i<s.length();i++){ 
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)== ch1 && stack.peek()=='(' || s.charAt(i)== ch2 && stack.peek()=='{'    || s.charAt(i)== ch3 && stack.peek()=='['){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}