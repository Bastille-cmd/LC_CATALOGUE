class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
                continue;
            }
            else{
                if(stack.peek()<0 && asteroids[i]<0){
                    stack.push(asteroids[i]);
                    continue;
                }
                if(Math.abs(stack.peek())>Math.abs(asteroids[i])){
                    continue;
                }
                else{
                    while(Math.abs(stack.peek())<Math.abs(asteroids[i])){
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroids[i]);
                            continue;
                        }
                        if(stack.peek()<0 && asteroids[i]<0){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                    if(stack.peek()>0 && Math.abs(stack.peek())==Math.abs(asteroids[i])){
                        stack.pop();
                    }
                }
            }
        }
        int size=stack.size();
        int[] arr=new int[size];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
    }
}