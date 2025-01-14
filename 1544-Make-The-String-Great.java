class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && Math.abs(stack.peek()-ch)==32){
                stack.pop();
            }
            else stack.push(ch);
        }
        String str=new String();
        while(!stack.isEmpty()){
            str= stack.pop() +str;
        }
        return str;
    }
}