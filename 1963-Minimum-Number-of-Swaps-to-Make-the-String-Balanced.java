class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        int size=stack.size();
        int count=0;
        while(size>0){
            size=size-4;
            count++;
        }
        return count;
    }
}